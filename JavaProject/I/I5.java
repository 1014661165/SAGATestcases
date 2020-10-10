package I;

public class I5{
	
	public static void load(){
       
		if (new File(CONFIG_FILE).exists()) {
			properties.load(new FileReader(CONFIG_FILE));

			suffix = properties.getProperty("suffix");
			repoPath = properties.getProperty("repoPath");
			outputFolder = properties.getProperty("outputFolder");
			startCommit = properties.getProperty("startCommit");
			endCommit = properties.getProperty("endCommit");
			commitInterval = Integer.parseInt(properties.getProperty("commitTimeInterval"));
			outputInterval = Integer.parseInt(properties.getProperty("outputInterval").trim());
			traceCommit = properties.getProperty("traceCommit");
			extractedPath = properties.getProperty("extractedPath");
		} else {
			save();
			System.out.println("请修改配置文件analysisGit.properties！");
			System.exit(0);
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------");
		
		if (new File(CONFIG_FILE).exists()) {
			properties.load(new FileReader(CONFIG_FILE));

			suffix = properties.getProperty("suffix");
			repoPath = properties.getProperty("repoPath");
			outputFolder = properties.getProperty("outputFolder");
			startCommit = properties.getProperty("startCommit");
			endCommit = properties.getProperty("endCommit");
			commitInterval = Integer.parseInt(properties.getProperty("commitTimeInterval"));
			outputInterval = Integer.parseInt(properties.getProperty("outputInterval").trim());
			traceCommit = properties.getProperty("traceCommit");
			extractedPath = properties.getProperty("extractedPath");
		} else {
			save();
			System.out.println("请修改配置文件analysisGit.properties！");
			System.exit(0);
		}
        
    }
	
}