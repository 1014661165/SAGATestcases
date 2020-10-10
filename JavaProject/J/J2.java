package J;

public class J2{
	
	private static boolean isModified(CloneInstance oldCloneInstance, EditList editList){
        boolean isModified = false;
        for(Edit edit:editList){
            int beginA = edit.getBeginA();
            int endA = edit.getEndA();
            if(  oldCloneInstance.getStartLine() < beginA
            &&   oldCloneInstance.getEndLine() > endA){
                isModified = true;
            }
        }
        return isModified;
		
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		boolean isModified = false;
        for(Edit edit:editList){
            int beginA = edit.getBeginA();
            int endA = edit.getEndA();
            if(  oldCloneInstance.getStartLine() < beginA
            &&   oldCloneInstance.getEndLine() > endA){
                isModified = true;
            }
        }
        return isModified;

    }
	
}