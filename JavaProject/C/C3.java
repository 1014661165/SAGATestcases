package C;

public class C3 {
	
	public static List<String> getContent(String version, String filePath){
        try {
            filePath = getVersedRelativePath(filePath);
            ObjectId lastCommitId = repository.resolve(version);
            revWalk.reset();
            RevCommit commit = revWalk.parseCommit(lastCommitId);
            RevTree tree = commit.getTree();
            treeWalk.reset();
            treeWalk.addTree(tree);
            treeWalk.setRecursive(true);
            treeWalk.setFilter(PathFilter.create(filePath));
            if (!treeWalk.next()) {
                return new ArrayList<>();
            }
            ObjectId objectId = treeWalk.getObjectId(0);
            ObjectLoader loader = repository.open(objectId);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            loader.copyTo(outputStream);
            String content = outputStream.toString();
            List<String> lines = Arrays.asList(content.split("\n"));
            outputStream.close();
            return lines;

        }catch (Exception e){
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
	
}