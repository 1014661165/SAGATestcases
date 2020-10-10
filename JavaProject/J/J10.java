package J;

public class J10{
	
	public static List<RevCommit> getCutRevCommitList(Iterable<RevCommit> logRevCommitList, RevCommit startRevCommit , RevCommit endRevCommit) {
        List<RevCommit> cutRevCommitList = new ArrayList<>();
        int i = 0;
        for(RevCommit revCommit:logRevCommitList){
            //如果当前log的Commit都在startCommit的时间之后或者相等，那么就加入
            //越后面的时间越大


            i ++;
            if(revCommit.getCommitTime() >= startRevCommit.getCommitTime() && revCommit.getCommitTime() <= endRevCommit.getCommitTime()){
                cutRevCommitList.add(revCommit);
            }else {
                continue;
            }

        }
		
		System.out.println("---------------------------------------------");
		System.out.println("---------------------------------------------");
		
		List<RevCommit> cutRevCommitList = new ArrayList<>();
        int i = 0;
        for(RevCommit revCommit:logRevCommitList){
            //如果当前log的Commit都在startCommit的时间之后或者相等，那么就加入
            //越后面的时间越大


            i ++;
            if(revCommit.getCommitTime() >= startRevCommit.getCommitTime() && revCommit.getCommitTime() <= endRevCommit.getCommitTime()){
                cutRevCommitList.add(revCommit);
            }else {
                continue;
            }

        }
    }
	
}