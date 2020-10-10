package H;

public class H1 {
	
	public static int computeDistance(List<String> fileList) {
        HashMap<String, Integer> fileMap = initFileMap(fileList);
        List<String> noSame_fileList = new ArrayList<>(fileMap.keySet());

        List<String[]> fileFragList = new ArrayList<>();
        int size_MIN = 10000;
        for (String fileString : noSame_fileList) {
            String[] fileFrag = fileString.split("/");
            if (fileFrag.length < size_MIN) {
                size_MIN = fileFrag.length;
            }
            fileFragList.add(fileFrag);
        }

        int fatherNodeIndex = computeFatherNodeIndex(fileFragList, size_MIN);

        int distance = 0;

        for (String[] fileFrag : fileFragList) {
            int dist = fileFrag.length - fatherNodeIndex - 1;
//            System.out.println(""+ Arrays.toString(fileFrag)+dist);
            distance += dist;
        }

        return distance;
    }
	
}