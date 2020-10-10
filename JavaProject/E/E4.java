package E;

public class E4 {
	
	/**
     * 初始化仓库
     * @param repoDir
     * @throws IOException
     */
    public static void initRepository(String repoDir)throws IOException {
        if(Config.IS_MULTI.equals("no")){
            repository = new FileRepositoryBuilder()
                    .setGitDir(new File(repoDir + File.separator + ".git"))
                    .build();
            revWalk = new RevWalk(repository);
            treeWalk = new TreeWalk(repository);
            repositoryMap = new HashMap<>();
        }
        if(Config.IS_MULTI.equals("yes")){
            File projectsDir = new File(repoDir);
            if (!projectsDir.exists()){
                System.out.printf("%s not exist!\n", repoDir);
                System.exit(0);
            }
            File[] projects = projectsDir.listFiles();
            if (projects == null || projects.length == 0){
                System.out.printf("%s is empty!\n", repoDir);
                System.exit(0);
            }

            repositoryMap = new HashMap<>();
            for (File project: projects){
                Repository repository = new FileRepositoryBuilder()
                        .setGitDir(new File(project.getAbsolutePath() + File.separator + ".git"))
                        .build();
                repositoryMap.put(project.getName(), repository);
            }
        }
    }
	
}