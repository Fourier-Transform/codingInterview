import java.util.LinkedList;
public class Jz02 {
    public String replaceSpace(StringBuffer str) {
    	if(str == null) return new String("");
        LinkedList<Character> list = new LinkedList<>();
        StringBuffer ret = new StringBuffer();
        for(int i = 0; i < str.length(); i++){
            list.add(str.charAt(i));
        }
        for (Character i: list
             ) {
            if(i.equals(' ')){
                ret.append("%20");
            }else{
                ret.append(i);
            }
        }
        return new String(ret);
        
    }
}