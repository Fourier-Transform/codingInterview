import java.util.Collections;
public class Jz44 {
    public String ReverseSentence(String str) {
        if(str == null || str.length() == 0) return new String();
        String[] reverse = str.split(" ");
        if(reverse.length == 0) return str;
        StringBuilder sb = new StringBuilder();
        for(int i = reverse.length - 1; i>=0; i--){
            sb.append(reverse[i] + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}