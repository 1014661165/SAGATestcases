package G;

public class G8{
	
	public static void getCloneGroupAge(List<List<EvolutionMergeResult.EvolutionRecord>> records){
        Long age = 0l;
        String time = "";
        for(int i = 0; i < records.size(); i++){
            int insNumber = 0;
            List<EvolutionMergeResult.EvolutionRecord> curList = records.get(i);
            for(int j = 0; j < curList.size(); j++){
                EvolutionMergeResult.EvolutionRecord curRe = curList.get(j);
                if(!curRe.status.equals("") && !curRe.status.equals("D")){
                    insNumber += 1;
                }
                if(insNumber > 1 && !curRe.date.equals(""))
                    time = curRe.date;
            }
            if(insNumber <= 1) {
                try {
                    Long curTime = DateUtil.getTimestamp(DateUtil.format(new Date()));
                    Long bornTime = DateUtil.getTimestamp(time);
                    cloneGroupAge = Math.abs(curTime - bornTime) / 1000;
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
    }
	
}