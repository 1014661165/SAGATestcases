package F;

public class F2 {
	
	private static void initSingleProject() throws IOException {
        System.out.println(Config.COMMIT_INFO);
        List<String> commitList = FileUtil.readLines(Config.COMMIT_INFO);

        int lineNumber = 0;
        String latestCommitId = "";
        for (String line:commitList) {
            String[] tempList = line.split(",");
            if(lineNumber == 0)
                latestCommitId = tempList[0];
            RawCommitInfo info = new RawCommitInfo(tempList[0],tempList[1],tempList[2],tempList[3], ++lineNumber, tempList[4].replaceAll("###","\n"), "default");
            RawCommitManager.rawCommitInfoMap.put(tempList[0], info);
        }
        RawCommitManager.latestCommitId = latestCommitId;
    }
	
}