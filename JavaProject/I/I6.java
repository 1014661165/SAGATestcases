package I;

public class I6{
	
	private static List<RevCommit> getCutRevCommitList(List<RevCommit> logRevCommitList, RevCommit startRevCommit ) {
        ////new ... old
        List<RevCommit> cutRevCommitList = new ArrayList<>();
        for(RevCommit revCommit:logRevCommitList){
            //如果当前log的Commit都在startCommit的时间之后或者相等，那么就加入
            //越后面的时间越大
            if(revCommit.getCommitTime() >= startRevCommit.getCommitTime()){
                cutRevCommitList.add(revCommit);
            }else {
                break;
            }
        }
		
		System.out.println("---------------------------------------------------");
		System.out.println("---------------------------------------------------");
        
		////new ... old
        List<RevCommit> cutRevCommitList = new ArrayList<>();
        for(RevCommit revCommit:logRevCommitList){
            //如果当前log的Commit都在startCommit的时间之后或者相等，那么就加入
            //越后面的时间越大
            if(revCommit.getCommitTime() >= startRevCommit.getCommitTime()){
                cutRevCommitList.add(revCommit);
            }else {
                break;
            }
        }

    }
	
}