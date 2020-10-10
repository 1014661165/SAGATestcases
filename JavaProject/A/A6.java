package A;

public class A6 {
	
	/**
     * 计算克隆片段的重叠长度
     * @param pairs
     * @return
     */
    private static int calculateOverlapping(List<ClonePair> pairs){
        int index = 0;
        int startToken = 0;
        int size = 0;
        int totalSize = 0;

        while (index < pairs.size()){
            int pairIndex = pairs.get(index).first;
            int pairSize = pairs.get(index).size;
            if (index == 0){
                startToken = pairIndex;
                size = pairSize;
                index++;
                continue;
            }
            if (startToken + size >= pairIndex) {
                if (startToken + size >= pairIndex + pairSize){
                }else{
                    size = pairIndex - startToken + pairSize;
                }
                index++;
            }else{
                totalSize += size;
                startToken = pairIndex;
                size = pairSize;
                index++;
            }
        }
        return Math.max(totalSize, size);
    }
}