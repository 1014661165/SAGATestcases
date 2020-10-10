package J;

public class J5{
	
	private static CloneInstanceWithStatus getNewCloneInstanceWithStatus(EditList editList, CloneInstance oldCloneInstance){
        
        if(newStartLine == -1 && newEndLine == -1){
            statusInNewCommit = Status.D;
        }
        else if(newStartLine == -1){
            newStartLine = getNewStartLine(oldCloneInstance.getStartLine(), editList);
            statusInNewCommit = Status.E;
            //TODO
            //考虑insert的开始行处于oldCloneInstance.startLine的情况
        }
        else if(newEndLine == -1){
            newEndLine = getNewEndLine(oldCloneInstance.getEndLine(), editList);
            statusInNewCommit  = Status.E;
        }else if(newStartLine == newEndLine){
            //一段变一行
            statusInNewCommit = Status.D;
        }else {
            //遍历Editlist 看看是不是modify了
            if(isModified(oldCloneInstance, editList)){
                statusInNewCommit = Status.M;
            }
        }
		
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
        
		if(newStartLine == -1 && newEndLine == -1){
            statusInNewCommit = Status.D;
        }
        else if(newStartLine == -1){
            newStartLine = getNewStartLine(oldCloneInstance.getStartLine(), editList);
            statusInNewCommit = Status.E;
            //TODO
            //考虑insert的开始行处于oldCloneInstance.startLine的情况
        }
        else if(newEndLine == -1){
            newEndLine = getNewEndLine(oldCloneInstance.getEndLine(), editList);
            statusInNewCommit  = Status.E;
        }else if(newStartLine == newEndLine){
            //一段变一行
            statusInNewCommit = Status.D;
        }else {
            //遍历Editlist 看看是不是modify了
            if(isModified(oldCloneInstance, editList)){
                statusInNewCommit = Status.M;
            }
        }
    }
	
}