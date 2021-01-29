public class Jz65 {
    int rows;
    int cols;
    int[] move;
    boolean flag;
    public boolean hasPath(char[] matrix, int row_length, int col_length, char[] str)
    {
        flag = false;
        rows = row_length;
        cols = col_length;
        move = new int[rows*cols];
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i] == str[0]) dfs(i/cols, i%cols, matrix, str, 0);
        }
        System.out.println(flag);
        return flag;

    }

    public void dfs(int i, int j, char[] matrix, char[] str, int p){
        if(p == str.length){
            flag = true;
            return;
        }
        if(i < 0 || j < 0 || i >= rows || j >= cols){
            return;
        }
        if(matrix[i*cols + j] == str[p] && move[i*cols + j] == 0){
            move[i*cols + j] = 1;
            dfs(i + 1, j, matrix, str, p + 1);
            dfs(i - 1, j, matrix, str, p + 1);
            dfs(i, j + 1, matrix, str, p + 1);
            dfs(i, j - 1, matrix, str, p + 1);
            move[i*cols + j] = 0;
        }
    }
}