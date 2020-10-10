package H;

public class H3 {
	
	private static HashMap<String, Integer> initFileMap(List<String> fileList) {
        HashMap<String, Integer> fileMap = new HashMap<>();
        for (String fileString : fileList) {
            int index = fileString.lastIndexOf("/");
            if(index == -1)
                index = 0;
            fileString = fileString.substring(0, index);
            if (fileMap.containsKey(fileString)) {
                fileMap.put(fileString, fileMap.get(fileString) + 1);
            } else {
                fileMap.put(fileString, 1);
            }
        }
        return fileMap;
    }
	
}