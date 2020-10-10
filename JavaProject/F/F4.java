package F;

public class F4 {
	
	public static void initSnapshotBlobMapper(){
        try {
            List<String> mappedId = FileUtil.readLines(Config.BLOB_SNAPSHOT_MAP_RESULT);
            String groupZero = "0";
            for (String line : mappedId) {
                if(line.contains("@")){
                    String[] ids = line.split("@");
                    if (ids.length < 2){
                        continue;
                    }
                    List<String> blobGroupIds = SnapshotToBlobGroupManager.snapshotBlobGroupIdMapper.getOrDefault(ids[1], new ArrayList<>());
                    if (!groupZero.equals(ids[0])){
                        blobGroupIds.add(ids[0]);
                    }
                    SnapshotToBlobGroupManager.snapshotBlobGroupIdMapper.put(ids[1], blobGroupIds);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}