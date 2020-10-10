package G;

public class G6{
	
	public static void process(String file, String name){
        try{
            List<EvolutionMergeResult> data = loadData(file);
            String groupName = name;
            for (EvolutionMergeResult ele: data) {
                System.out.println(ele.toString());
                String commitId = ele.commitId;
                List<EvolutionMergeResult.EvolutionRecord> codes = ele.getCodes();
                List<InstanceInfo> insInfoList = new ArrayList<>();
                for (EvolutionMergeResult.EvolutionRecord record : codes) {
                    InstanceInfo info = new InstanceInfo(Integer.toString(record.id), commitId, record.status);
                    insInfoList.add(info);
                }
                tempInfo.add(insInfoList);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
	
}