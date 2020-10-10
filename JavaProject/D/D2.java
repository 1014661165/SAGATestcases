package D;

public class D2 {
	
	public static void setRelevantStartLine(List<CommitRecord> recordList){
        int minStartLine = 1000000;
        List<Integer> tempList = new ArrayList<>();
        for(CommitRecord record : recordList){
            if(record.getStartLine() < minStartLine)
                minStartLine = record.getStartLine();
        }
        for(CommitRecord record : recordList){
            record.setRelevantStartLine(record.getStartLine() - minStartLine);
            tempList.add(record.getStartLine() - minStartLine);
        }
        Collections.sort(tempList);
        for(CommitRecord record : recordList){
            int rl = record.getRelevantStartLine();

            record.setRelevantStartLine(tempList.indexOf(rl));
        }
    }
	
}