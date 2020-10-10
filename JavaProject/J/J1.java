package J;

public class J1{
	
	private static int getNewStartLine(int startLine, EditList editList){
        for(Edit edit:editList){
            if(edit.getBeginA() <= startLine && startLine <= edit.getEndA()){
                return edit.getBeginB();
            }
        }
        return -1;
		
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		for(Edit edit:editList){
            if(edit.getBeginA() <= startLine && startLine <= edit.getEndA()){
                return edit.getBeginB();
            }
        }
        return -1;
    }
	
}