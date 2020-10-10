package C;

public class C5 {
	
	/**
     * 获取blobPath
     * @param commitId
     * @param realPath
     * @return
     */
    public static String getBlobId(String commitId, String realPath){
        String blobId = null;
        try {
            realPath = getVersedRelativePath(realPath);
            ObjectId lastCommitId = repository.resolve(commitId);
            revWalk.reset();
            RevCommit commit = revWalk.parseCommit(lastCommitId);
            RevTree tree = commit.getTree();
            treeWalk.reset();
            treeWalk.addTree(tree);
            treeWalk.setRecursive(true);
            treeWalk.setFilter(PathFilter.create(realPath));
            if (!treeWalk.next()) {
                return null;
            }
            ObjectId objectId = treeWalk.getObjectId(0);
            blobId = objectId.getName();
        }catch (Exception e){
            e.printStackTrace();
        }
        return blobId;
    }
	
}