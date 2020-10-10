package F;

public class F7 {
	
	public static void extractConsistTimeInterval(){
        Collections.sort(timeStampList);
        Collections.sort(allTimestampList);
        if(timeStampList.size() == 0)
            timeStampList.add(0l);
        if(allTimestampList.size() == 0)
            allTimestampList.add(0l);

        maxConsisTimeInterval = timeStampList.get(timeStampList.size() - 1);
        midConsisTimeInterval = median(timeStampList);//timeStampList.get(timeStampList.size() / 2);
        quaterTimeInterval = timeStampList.get((timeStampList.size() * 3 - 1) / 4);
        averageConsisTimeInterval = computeAverageTimeStamp(timeStampList);

        maxConsisTimeInterval1 = allTimestampList.get(allTimestampList.size() - 1);
        midConsisTimeInterval1 = median(allTimestampList);//timeStampList.get(timeStampList.size() / 2);
        quaterTimeInterval1 = allTimestampList.get((allTimestampList.size() * 3 - 1) / 4);
        averageConsisTimeInterval1 = computeAverageTimeStamp(allTimestampList);
    }
	
}