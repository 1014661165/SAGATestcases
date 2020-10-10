package I;

public class I7{
	
	private static boolean isTwoEditContentEquals(EditContent left, EditContent right){

        if(( left.getAddStringList().size() != right.getAddStringList().size() )
            || ( left.getRemoveStringList().size() != right.getRemoveStringList().size())
        )
        {
            //数目不相等，不需要字符串比较
            return false;
        } else if (isTwoStringListEquals(left.getAddStringList(), right.getAddStringList())
                && isTwoStringListEquals(left.getRemoveStringList(), right.getRemoveStringList())
        ) {

            return true;
        }else {
            return false;
        }
		
		System.out.println("------------------------------------------------");
		System.out.println("------------------------------------------------");
		
		if(( left.getAddStringList().size() != right.getAddStringList().size() )
            || ( left.getRemoveStringList().size() != right.getRemoveStringList().size())
        )
        {
            //数目不相等，不需要字符串比较
            return false;
        } else if (isTwoStringListEquals(left.getAddStringList(), right.getAddStringList())
                && isTwoStringListEquals(left.getRemoveStringList(), right.getRemoveStringList())
        ) {

            return true;
        }else {
            return false;
        }
    }
	
}