package F;

public class F6 {
	
	private static EvolutionMergeResult.EvolutionRecord getNewInstance(EvolutionMergeResult.EvolutionRecord instance, String commitDate, String code){
        EvolutionMergeResult.EvolutionRecord newIns = instance;
        if(instance.status.equals(""))
            return newIns;
        long time = 0l;
        try {
            System.out.println(instance.instanceNumber + "\n");
            String bornTime = insBornMap.get(instance.instanceNumber);
            System.out.println(commitDate + " -- " + bornTime + "\n");
            time = DateUtil.getTimestamp(commitDate) - DateUtil.getTimestamp(bornTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(time == 0l){
            if(newIns.status.equals("NULL")){
                newIns.status = "B-NULL";
                newIns.preCode = code;
                newIns.curCode = code;
            }
            else{
                newIns.status = "B";
                newIns.preCode = newIns.curCode;
            }
        }
        else if(time < 0l){
            if(!newIns.status.equals("NULL"))
                newIns.status = "";
            newIns.preCode = "";
            newIns.curCode = "";
        }

        return newIns;
    }
	
}