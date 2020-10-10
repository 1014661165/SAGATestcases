package J;

public class J6{
	
	private static List<EditContent> tmpCutEditContentList(List<EditContent> fullEditContentList, CloneInstance oldCloneInstance){
        
        List<EditContent> editContentListAfterCut = new ArrayList<>();
        int startLine = oldCloneInstance.getStartLine();
        int endLine = oldCloneInstance.getEndLine();
        for(EditContent editContent:fullEditContentList) {
            int beginA = editContent.getEdit().getBeginA();
            int endA = editContent.getEdit().getEndA();

            //这种情况肯定没问题
            if(startLine < beginA && endA < endLine){
                editContentListAfterCut.add(editContent);
                continue;
            }
            else if( beginA <= startLine && startLine <= endA){
                editContentListAfterCut.add(editContent);
                continue;
            }else if( beginA <= endLine && endLine <= endA){
                editContentListAfterCut.add(editContent);
                continue;
            }
        }
		
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		
		List<EditContent> editContentListAfterCut = new ArrayList<>();
        int startLine = oldCloneInstance.getStartLine();
        int endLine = oldCloneInstance.getEndLine();
        for(EditContent editContent:fullEditContentList) {
            int beginA = editContent.getEdit().getBeginA();
            int endA = editContent.getEdit().getEndA();

            //这种情况肯定没问题
            if(startLine < beginA && endA < endLine){
                editContentListAfterCut.add(editContent);
                continue;
            }
            else if( beginA <= startLine && startLine <= endA){
                editContentListAfterCut.add(editContent);
                continue;
            }else if( beginA <= endLine && endLine <= endA){
                editContentListAfterCut.add(editContent);
                continue;
            }
        }
    }
	
}