package J;

public class J7{
	
	private static String formatDiffInfo(DiffInfo diffInfo){
        List<String> itemList = new ArrayList<>();
        itemList.add(diffInfo.getNewRevCommit().getName());

        int timestamp = diffInfo.getNewRevCommit().getCommitTime();
        String date = TimeUtil.getTime(timestamp);
        itemList.add(date);

        itemList.add(diffInfo.getNewCloneInstance().getPath());
        itemList.add(diffInfo.getNewCloneInstance().getStartLine().toString());
        itemList.add(diffInfo.getNewCloneInstance().getEndLine().toString());
        itemList.add(diffInfo.getNewRevCommit().getAuthorIdent().getName());
        itemList.add(diffInfo.getStatus().name());

        //还差一致性修改的信息没有输出
        //有多少段编辑
//        itemList.add(new Integer(diffInfo.getEditContentList().size()).toString());
//        itemList.add(getCoChangeEditNum(diffInfo.getEditContentList()).toString());

        String result = String.join(",", itemList);
        return result;
		
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		List<String> itemList = new ArrayList<>();
        itemList.add(diffInfo.getNewRevCommit().getName());

        int timestamp = diffInfo.getNewRevCommit().getCommitTime();
        String date = TimeUtil.getTime(timestamp);
        itemList.add(date);

        itemList.add(diffInfo.getNewCloneInstance().getPath());
        itemList.add(diffInfo.getNewCloneInstance().getStartLine().toString());
        itemList.add(diffInfo.getNewCloneInstance().getEndLine().toString());
        itemList.add(diffInfo.getNewRevCommit().getAuthorIdent().getName());
        itemList.add(diffInfo.getStatus().name());

        //还差一致性修改的信息没有输出
        //有多少段编辑
//        itemList.add(new Integer(diffInfo.getEditContentList().size()).toString());
//        itemList.add(getCoChangeEditNum(diffInfo.getEditContentList()).toString());

        String result = String.join(",", itemList);
        return result;
    }
	
}