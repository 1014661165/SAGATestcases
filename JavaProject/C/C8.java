package C;

public class C8 {
	
	public static String getContentByBlobId(String blobId, int startLine, int endLine){
        if(blobId == null || blobId.isEmpty()){
            return "";
        }

        if(!groupContentInfo.contentMap.containsKey(blobId)){
            String blobPath = PathUtil.getBlobPathByBlobId(blobId);
            try {
                groupContentInfo.contentMap.put(blobId, FileUtil.readLines(blobPath));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        StringBuilder builder = new StringBuilder();
        List<String> content = groupContentInfo.contentMap.get(blobId);
        for(int i = 0; i < content.size(); i++){
            if(i > endLine)
                break;
            if(i >= startLine && i <= endLine)
                builder.append(content.get(i) + "\n");
        }
        return builder.toString();
    }
	
}