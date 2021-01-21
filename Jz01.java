public class Jz01 {
    public boolean Find(int target, int [][] array) {
        if(array == null){
            return false;
        }
        int line = array.length;
        int row = array[0].length;
        int i = 0, j = row - 1;
        while(i <= line - 1 && j >= 0){
            if(array[i][j] == target){
                return true;
            }
            else if(array[i][j] > target){
                j = j - 1;
            }
            else if(array[i][j] < target){
                i = i + 1;
            }
        }
        return false;
    }
}