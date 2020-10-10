package J;

public class J4{
	
	 private static Pair<String, EditList> processDiffEntry(Repository repository, DiffEntry diffEntry){
        //define 输出流
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DiffFormatter formatter = new DiffFormatter(byteArrayOutputStream);
        formatter.setRepository(repository);
        formatter.setContext(0);
        //先不设置空白行比较
        formatter.setDiffComparator(RawTextComparator.WS_IGNORE_ALL);

        EditList editList = null;
        String diffLogText = null;
        try {
            formatter.format(diffEntry);
            diffLogText =  byteArrayOutputStream.toString();
            byteArrayOutputStream.close();
            editList = formatter.toFileHeader(diffEntry).toEditList();
            //获取必要信息成功
        } catch (IOException e) {
            e.printStackTrace();
        }
        Pair<String, EditList> diffTextEditListPair = new Pair(diffLogText, editList);
        return diffTextEditListPair;
		
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		//define 输出流
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DiffFormatter formatter = new DiffFormatter(byteArrayOutputStream);
        formatter.setRepository(repository);
        formatter.setContext(0);
        //先不设置空白行比较
        formatter.setDiffComparator(RawTextComparator.WS_IGNORE_ALL);

        EditList editList = null;
        String diffLogText = null;
        try {
            formatter.format(diffEntry);
            diffLogText =  byteArrayOutputStream.toString();
            byteArrayOutputStream.close();
            editList = formatter.toFileHeader(diffEntry).toEditList();
            //获取必要信息成功
        } catch (IOException e) {
            e.printStackTrace();
        }
        Pair<String, EditList> diffTextEditListPair = new Pair(diffLogText, editList);
        return diffTextEditListPair;
    }
	
}