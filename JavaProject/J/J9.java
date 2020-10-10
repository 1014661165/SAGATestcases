package J;

public class J9{
	
	public static List<RevCommit> getCommitList(RevWalk revWalk, RevCommit startRevCommit, RevCommit endRevCommit){
        
        while (curCommit.getParentCount() > 0){
            revCommitList.add(curCommit);
            String parentCommitStr = curCommit.getParent(0).getName();
            try {
                curCommit = revWalk.parseCommit(ObjectId.fromString(parentCommitStr));
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
            if(startRevCommit.getName().equals(curCommit.getName())){
                //touch start commit
                break;
            }
            if(curCommit.getCommitTime() < startRevCommit.getCommitTime()){
                break;
            }
        }
        //end ...start
        return revCommitList;
		
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		while (curCommit.getParentCount() > 0){
            revCommitList.add(curCommit);
            String parentCommitStr = curCommit.getParent(0).getName();
            try {
                curCommit = revWalk.parseCommit(ObjectId.fromString(parentCommitStr));
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
            if(startRevCommit.getName().equals(curCommit.getName())){
                //touch start commit
                break;
            }
            if(curCommit.getCommitTime() < startRevCommit.getCommitTime()){
                break;
            }
        }
        //end ...start
        return revCommitList;
    }
	
}