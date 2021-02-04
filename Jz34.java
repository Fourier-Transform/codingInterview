public class Jz34 {
    public int FirstNotRepeatingChar(String str) {
        int ret = -1;
        if(str == null) return ret;
        char[] arr = str.toCharArray();
        int[] times = new int[128];
        int[] location = new int[128];
        for(int i = 0; i < arr.length; i++){
            if(location[arr[i]] == 0) location[arr[i]] = i;
            times[arr[i]]++;
        }
        ret = 2147483647;
        for(int i = 0; i < times.length; i++){
            if(times[i] == 1){
                ret = ret < location[i] ? ret:location[i];
            }
        }
        if(ret == 2147483647){
            return -1;
        }else{
            return ret;
        }
    }
}