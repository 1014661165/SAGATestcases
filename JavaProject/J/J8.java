package J;

public class J8{
	
	public static List<String> getFileContent(Repository repository, RevCommit revCommit, String filePath){
        try {
            TreeWalk treeWalk = new TreeWalk(repository);
            RevTree tree = revCommit.getTree();
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

            treeWalk.close();
            return lines;

        }catch (Exception e){
            e.printStackTrace();
        }
		
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
        
		
		try {
            TreeWalk treeWalk = new TreeWalk(repository);
            RevTree tree = revCommit.getTree();
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

            treeWalk.close();
            return lines;

        }catch (Exception e){
            e.printStackTrace();
        }
    }
	
}