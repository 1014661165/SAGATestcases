package H;

public class H6 {
	
	public static void main(String[] args) {
        List<String> fileList = new ArrayList<>();
        // clone instances in the same file
        fileList.add("C:/pj_001/main/util/Tool.java/10-20");
        fileList.add("C:/pj_001/main/util/Tool.java/30-40");
        fileList.add("C:/pj_001/main/util/Tool.java/50-60");
        // clone instances in different dirs
        fileList.add("C:/pj_001/main/util/JsonParser.java/100-110");
        fileList.add("C:/pj_001/main/test/testService/Test.java/10-20");
        fileList.add("C:/pj_001/main/service/user/customer/action/purchaseService/Service.java/500-510");


        List<String> fileList2 = new ArrayList<>();
        // clone instances in the same file
        fileList2.add("src/t_set.c/804-853");
        fileList2.add("src/t_hash.c/sds.c/0-0");

//        System.out.println(ComputeDistanceUtil.computeDistance(fileList));
        System.out.println(ComputeDistanceUtil.computeDistance(fileList2));

    }
	
}