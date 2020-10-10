package G;

public class G10{
	
	private static boolean isModifyEqual(LinkedList<diff_match_patch.Diff> leftDiff, LinkedList<diff_match_patch.Diff> rightDiff) {
//        return (leftDiff.containsAll(rightDiff) && rightDiff.containsAll(leftDiff));
        int sizeLeft = leftDiff.size();
        int sizeRight = rightDiff.size();
        LinkedList<diff_match_patch.Diff> matchedDiffList = new LinkedList<>();
        LinkedList<diff_match_patch.Diff> outterDiffList;
        LinkedList<diff_match_patch.Diff> innerDiffList;
        String IDENTIFIER = "IDENTIFIER";
        if(sizeLeft >= sizeRight){
            outterDiffList = leftDiff;
            innerDiffList = rightDiff;
        }else{
            outterDiffList = rightDiff;
            innerDiffList = leftDiff;
        }
        for(int i = 0; i < outterDiffList.size(); i++){
            for(int j = 0; j < innerDiffList.size(); j++){
                if(outterDiffList.get(i).operation.equals(innerDiffList.get(j).operation)){
                    String outterEditString = outterDiffList.get(i).text.replaceAll("\".*\"", IDENTIFIER);
                    String innerEditString = innerDiffList.get(j).text.replaceAll("\".*\"", IDENTIFIER);
                    outterEditString = outterEditString.replaceAll("\t", "");
                    innerEditString = innerEditString.replaceAll("\t", "");
                    if(outterEditString.replaceAll(" ", "").equals("") || innerEditString.replaceAll(" ", "").equals(""))
                        continue;
                    if(MinimumEditDistanceUtil.stringSimilarity(outterEditString, innerEditString) > 0.9){
                        matchedDiffList.add(outterDiffList.get(i));
                    }
                }
            }
        }

        consistencyModifyDegree = (double) matchedDiffList.size() / outterDiffList.size();

        return matchedDiffList.size() > 0;
    }
	
}