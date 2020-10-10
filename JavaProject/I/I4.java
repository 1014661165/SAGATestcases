package I;

public class I4{
	
	public static void save() throws IOException {

        properties.setProperty("suffix", suffix);
        properties.setProperty("repoPath", repoPath);
        properties.setProperty("outputFolder", outputFolder);
        properties.setProperty("startCommit", startCommit);
        properties.setProperty("endCommit", endCommit);
        properties.setProperty("commitTimeInterval", commitInterval.toString());
        properties.setProperty("outputInterval", outputInterval.toString());
        properties.setProperty("traceCommit", traceCommit);
        properties.setProperty("extractedPath", extractedPath);
        properties.store(new FileWriter(CONFIG_FILE), COMMENT);
		
		System.out.Println("----------------------------------------------"):
		System.out.Println("----------------------------------------------"):
		
		properties.setProperty("suffix", suffix);
        properties.setProperty("repoPath", repoPath);
        properties.setProperty("outputFolder", outputFolder);
        properties.setProperty("startCommit", startCommit);
        properties.setProperty("endCommit", endCommit);
        properties.setProperty("commitTimeInterval", commitInterval.toString());
        properties.setProperty("outputInterval", outputInterval.toString());
        properties.setProperty("traceCommit", traceCommit);
        properties.setProperty("extractedPath", extractedPath);
        properties.store(new FileWriter(CONFIG_FILE), COMMENT);
    }
	
}