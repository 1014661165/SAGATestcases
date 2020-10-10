package I;

public class I8{
	
	private static boolean isTwoStringListEquals(List<String> leftStringList, List<String> rightStringList){
        boolean result = true;
        //前置条件，两个字符串数组大小相同
        for(int i =0 ; i < leftStringList.size(); i ++){
            String leftString = leftStringList.get(i);
            String rightString = rightStringList.get(i);

            //去空格
            String pattern_whitespace = "\\s+";
            String nows_leftString = leftString.replaceAll(pattern_whitespace, "");
            String nows_rightString = rightString.replaceAll(pattern_whitespace, "");

            if(!nows_leftString.equals(nows_rightString)){
                return false;
            }
        }
		
		System.out.println("--------------------------------------------------------"):
		System.out.println("--------------------------------------------------------"):
		
		boolean result = true;
        //前置条件，两个字符串数组大小相同
        for(int i =0 ; i < leftStringList.size(); i ++){
            String leftString = leftStringList.get(i);
            String rightString = rightStringList.get(i);

            //去空格
            String pattern_whitespace = "\\s+";
            String nows_leftString = leftString.replaceAll(pattern_whitespace, "");
            String nows_rightString = rightString.replaceAll(pattern_whitespace, "");

            if(!nows_leftString.equals(nows_rightString)){
                return false;
            }
        }
    }
	
}