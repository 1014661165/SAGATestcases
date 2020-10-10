package G;

public class G2{
	
	private LinkedList<diff_match_patch.Diff> processDiffList(LinkedList<diff_match_patch.Diff> diffList){
        LinkedList<diff_match_patch.Diff> editList = new LinkedList<>();

        for(diff_match_patch.Diff diff : diffList){
            diff_match_patch.Operation operation = diff.operation;
            String[] textList = diff.text.split("\n");
            for(String text : textList){
                text = text.replace(" ", "");
                text = text.replace("\t", "");
                if(text.equals(""))
                    continue;
                diff_match_patch.Diff edit = new diff_match_patch.Diff(operation, text);
                editList.add(edit);
            }
        }

        return editList;
    }
	
}