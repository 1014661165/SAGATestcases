package E;

public class E8 {
	
	private static String getClassName(List<String> code, int startLine){
        String className = "";
        List<String> classNameList = new ArrayList<>();
        classNameList.add("defaultClass");
        int lineNum = 0;
        for(String line : code){
            lineNum += 1;
            if(line.contains("class"))
                classNameList.add(line.replace("\\s+", " "));
            if(lineNum >= startLine){
                className = classNameList.get(classNameList.size() - 1);
                break;
            }
        }

        return className;
    }
	
}