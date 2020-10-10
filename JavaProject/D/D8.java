package D;

public class D8 {
	
	public static DB getInstance(){
        if (instance != null){
            return instance;
        }
        try {
            Class.forName(Config.DRIVER);
            conn = DriverManager.getConnection(Config.URL, Config.USERNAME, Config.PASSWORD);
            if (conn != null){
                instance = new DB();
                System.out.printf("connect to %s successfully\n", Config.URL);
            }else{
                System.out.println("connect fail");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return instance;
    }
	
}