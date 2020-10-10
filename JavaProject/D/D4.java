package D;

public class D4 {
	
	public static int getInstanceCount(int groupId) throws SQLException {
        //DB db = DB.getInstance();
        DruidPooledConnection connection = DruidUtil.getConnection();
        if (connection == null){
            throw new SQLException("get connection failed");
        }
        String sql = String.format("select count(*) as insCount from %s where groupId = '" + groupId + "'", Config.TABLE);
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        int insCount = 0;
        if (resultSet.next()){
            insCount = resultSet.getInt("insCount");
        }
        try {
            resultSet.close();
            statement.close();
        }finally {
            connection.recycle();
        }
        return insCount;
    }
	
}