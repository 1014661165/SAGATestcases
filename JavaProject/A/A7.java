package A;

public class A7{
	
	/**
     * 代码token化方法
     * @param stat
     * @return
     */
    public static List<Byte> lexer(String stat){
        int index = 0;
        List<Byte> res = new ArrayList<>();
        String token = "";
        while (index < stat.length()){
            char c = stat.charAt(index);
            if (Character.isSpaceChar(c)){
                index++;
                continue;
            }
            if (Character.isDigit(c)){
                while (Character.isDigit(c)){
                    token += c;
                    if (++index >= stat.length())
                        break;
                    c = stat.charAt(index);
                }
                res.add(str2hash(token));
                token = "";
                continue;
            }
            if (Character.isLetter(c) || c == '_'){
                while (Character.isLetterOrDigit(c) || c == '_'){
                    token += c;
                    if (++index >= stat.length())
                        break;
                    c = stat.charAt(index);
                }
                res.add(str2hash(token));
                token = "";
                continue;
            }
            res.add(str2hash(c+""));
            index++;
        }
        return res;
    }
}