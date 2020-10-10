package E;

public class E1 {
	
	/**
     * 读取指定起止行的内容
     * @param file
     * @param startLine
     * @param endLine
     * @return
     * @throws IOException
     */
    public static String readIntervalText(String file, int startLine, int endLine)throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        StringBuilder builder = new StringBuilder();
        int lineNumber = 0;
        while ((line = reader.readLine()) != null){
            lineNumber++;
            if (lineNumber < startLine){
                continue;
            }
            if (lineNumber > endLine){
                break;
            }
            builder.append(line);
        }
        reader.close();
        return builder.toString();
    }
	
}