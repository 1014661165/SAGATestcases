package F;

public class F9 {
	
	public double computeEditBehaviorSimilarity(EvolutionMergeResult.EvolutionRecord instanceLeft, EvolutionMergeResult.EvolutionRecord instanceRight){
        double similarity = 0.0;

        String leftPreCode = formatCode(instanceLeft.preCode);
        String leftCurCode = formatCode(instanceLeft.curCode);
        String rightPreCode = formatCode(instanceRight.preCode);
        String rightCurCode = formatCode(instanceRight.curCode);
        LinkedList<diff_match_patch.Diff> leftModifyList=generateModifyInfo(leftPreCode, leftCurCode);
        LinkedList<diff_match_patch.Diff> rightModifyList=generateModifyInfo(rightPreCode, rightCurCode);
        // 过滤相同的部分
        cleanupOperation(leftModifyList, diff_match_patch.Operation.EQUAL);
        cleanupOperation(rightModifyList, diff_match_patch.Operation.EQUAL);
//        if(instanceLeft.id == 7 && instanceRight.id == 12)
//            System.out.println("");
        similarity = computeSimilarity(leftModifyList, rightModifyList);

        return similarity;
    }
	
}