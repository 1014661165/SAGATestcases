package E;

public class E6 {
	
	public static String getBlobIdByProName(String commitId, String realPath, String projectName){
        String blobId = null;
        try {
            realPath = getVersedRelativePath(realPath);
            ObjectId lastCommitId = repositoryMap.get(projectName).resolve(commitId);
            revWalk = new RevWalk(repositoryMap.get(projectName));
            RevCommit commit = revWalk.parseCommit(lastCommitId);
            RevTree tree = commit.getTree();
            treeWalk = new TreeWalk(repositoryMap.get(projectName));
            treeWalk.addTree(tree);
            treeWalk.setRecursive(true);
            treeWalk.setFilter(PathFilter.create(realPath));
            if (!treeWalk.next()) {
                revWalk.close();
                treeWalk.close();
                return null;
            }
            ObjectId objectId = treeWalk.getObjectId(0);
            blobId = objectId.getName();
            revWalk.close();
            treeWalk.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return blobId;
    }
	
}