package D;

public class D10 {
	
	/**
     * 初始化druid数据源连接池
     * @throws SQLException
     */
    public static void initDataSource() throws SQLException {
        if (dataSource != null){
            return;
        }
        dataSource = new DruidDataSource();
        dataSource.setDriverClassName(Config.DRIVER);
        dataSource.setUrl(Config.URL);
        dataSource.setUsername(Config.USERNAME);
        dataSource.setPassword(Config.PASSWORD);
        dataSource.setInitialSize(Config.INITIAL_SIZE);
        dataSource.setMaxActive(Config.MAX_ACTIVE);
        dataSource.setMaxWait(5000);
        dataSource.setMinIdle(10);
        dataSource.setTimeBetweenEvictionRunsMillis(60000);
        dataSource.setTestWhileIdle(true);
        dataSource.setValidationQuery("SELECT 1");
        dataSource.setTestOnBorrow(true);
        dataSource.setTestOnReturn(false);
        dataSource.init();
    }
	
}