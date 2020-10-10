package C;

public class C10 {
	
	/**
     * 查询最大的groupId
     * @return
     * @throws SQLException
     */
    public static int findMaxGroupId() throws SQLException {
        /*DB db = DB.getInstance();
        String sql = String.format("select max(groupId) as maxGroupId from %s", Config.TABLE);
        ResultSet resultSet = db.query(sql);
        int maxGroupId = 0;
        if (resultSet.next()){
            maxGroupId = resultSet.getInt("maxGroupId");
        }
        resultSet.close();
        return maxGroupId;*/
        DruidPooledConnection connection = DruidUtil.getConnection();
        if (connection == null){
            throw new SQLException("get connection failed");
        }
        String sql = String.format("select max(groupId) as maxGroupId from %s", Config.TABLE);
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        int maxGroupId = 0;
        if (resultSet.next()){
            maxGroupId = resultSet.getInt("maxGroupId");
        }
        try {
            resultSet.close();
            statement.close();
        }finally {
            connection.recycle();
        }
        return maxGroupId;
    }
	
}