package E;

public class E9 {
	
	public static void generateVisualData(){
        List<Integer> instanceNumber = new ArrayList<>(instanceList.keySet());
        Collections.sort(instanceNumber);
        for(String commitId:commitIdList){
            VisualCommitInfo curInfo = new VisualCommitInfo();
//                String curCId = commitOrderToId.get(commitOrder);
            RawCommitInfo rawCommitInfo = RawCommitManager.rawCommitInfoMap.get(commitId);
            curInfo.setCommitId(rawCommitInfo.commitId);
            curInfo.setDate(rawCommitInfo.date);
            curInfo.setSubmitter(rawCommitInfo.author);
            curInfo.setCommitMessage(rawCommitInfo.commitMessage);

            List<CommitRecord> curRecords = new ArrayList<>();
            Boolean needAdd = false;
            for(int insNumber: instanceNumber){
                CommitRecord curInsRecord = instanceList.get(insNumber).get(commitId);
                curRecords.add(curInsRecord);
                if(curInsRecord.getStatus() == "M" || curInsRecord.getStatus() == "B" || curInsRecord.getStatus() == "D")
                    needAdd = true;
            }
            if(needAdd){
                curInfo.setCodes(curRecords);

                visualCommitInfoList.add(curInfo);
            }
        }
    }
	
}