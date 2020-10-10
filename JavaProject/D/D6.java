package D;

public class D6 {
	
	public static Boolean isNextRecordExist(String blobId, String realPath, String commitId, String repoName){
//        String blobId = GitUtil.getBlobId(commitId, realPath);
        if(blobId == null){
            return false;
        }

        BlobCommitsetInfo commitsetInfo;
        String transformedBlobId = blobId + "###" + realPath.hashCode();
        if(BlobCommitSetManager.blobCommitSetManagerMap.containsKey(transformedBlobId)){
            commitsetInfo = BlobCommitSetManager.blobCommitSetManagerMap.get(transformedBlobId);
        }else{
            commitsetInfo = getBlobCommitSetByTransBlobId(transformedBlobId, repoName, realPath);
        }
        if(!commitsetInfo.commitSet.contains(commitId)){
            return false;
        }
        return true;
    }
	
}