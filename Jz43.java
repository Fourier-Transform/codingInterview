public class Jz43 {
    public String LeftRotateString(String str,int n) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for(int i = 0; i < str.length(); i++){
            sb.append(str.charAt((i+n)%length));
        }
        return sb.toString();
    }
}