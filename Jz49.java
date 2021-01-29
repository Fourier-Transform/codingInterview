public class Jz49 {
    public int StrToInt(String str) {
        if(str == null || str.length() == 0) return 0;
        char[] charArr = str.toCharArray();
        boolean negative = false;
        int digit = 1, ret = 0;
        int ending = 0;
        if(charArr[0] >= '0' && charArr[0] <= '9'){
            ending = 0;
        }else{
            ending = 1;
            if(charArr[0] == '-') negative =true;
        }
        for(int i = charArr.length - 1; i >= ending; i--){
            if('0' <= charArr[i] && charArr[i] <= '9'){
                ret += (charArr[i] - '0')*digit;
                digit *= 10;
            }else{
                return 0;
            }
        }
        if(negative) return -ret;
        else return ret;
    }
}