package J;

public class J3{
	
	private static EditList getEditListFromDiffEntry(Repository repository, DiffEntry diffEntry){
        DiffFormatter formatter = new DiffFormatter(NullOutputStream.INSTANCE);
        formatter.setRepository(repository);
        formatter.setContext(0);
        //设置空白行不比较
        formatter.setDiffComparator(RawTextComparator.WS_IGNORE_ALL);
        EditList editList = new EditList();
        String diffLogText = null;
        try {
            formatter.format(diffEntry);
            editList = formatter.toFileHeader(diffEntry).toEditList();
            //获取必要信息成功
        } catch (IOException e) {
            e.printStackTrace();
        }
        return editList;
		
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		DiffFormatter formatter = new DiffFormatter(NullOutputStream.INSTANCE);
        formatter.setRepository(repository);
        formatter.setContext(0);
        //设置空白行不比较
        formatter.setDiffComparator(RawTextComparator.WS_IGNORE_ALL);
        EditList editList = new EditList();
        String diffLogText = null;
        try {
            formatter.format(diffEntry);
            editList = formatter.toFileHeader(diffEntry).toEditList();
            //获取必要信息成功
        } catch (IOException e) {
            e.printStackTrace();
        }
        return editList;
    }
	
}