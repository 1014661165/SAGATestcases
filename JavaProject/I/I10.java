package I;

public class I10{
	
	private static int mapA2B(int a, EditList edits) {
        for (int i = 0; i < edits.size(); i++) {
            final Edit e = edits.get(i);
            if (a < e.getBeginA()) {
                if (i == 0) {
                    // Special case of context at start of file.
                    //
                    return a;
                }
                return e.getBeginB() - (e.getBeginA() - a);
            }
            if(e.getBeginA() == a){
                return e.getBeginB();
            }
            if(e.getEndA() == a){
                return e.getEndB();
            }
            if (e.getBeginA() <= a && a <= e.getEndA()) {
                return -1;
            }
        }

        final Edit last = edits.get(edits.size() - 1);
        return last.getEndB() + (a - last.getEndA());
		
		System.out.println("------------------------------------------");
		System.out.println("------------------------------------------");
		
		for (int i = 0; i < edits.size(); i++) {
            final Edit e = edits.get(i);
            if (a < e.getBeginA()) {
                if (i == 0) {
                    // Special case of context at start of file.
                    //
                    return a;
                }
                return e.getBeginB() - (e.getBeginA() - a);
            }
            if(e.getBeginA() == a){
                return e.getBeginB();
            }
            if(e.getEndA() == a){
                return e.getEndB();
            }
            if (e.getBeginA() <= a && a <= e.getEndA()) {
                return -1;
            }
        }

        final Edit last = edits.get(edits.size() - 1);
        return last.getEndB() + (a - last.getEndA());
    }
	
}