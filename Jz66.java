import java.util.Arrays;
public class Jz66 {
    int ret;
    int[][] move;
    int length;
    int width;
    public int movingCount(int threshold, int rows, int cols)
    {
        move = new int[rows][cols];
        ret = 0;
        length = rows;
        width = cols;
        dfs(threshold, 0, 0);
        return ret;
    }
    
    public void dfs(int threshold, int row, int col){
        if(row < 0 || col < 0 || row >= length || col >= width) return;
        if(check(threshold, row, col) == false || move[row][col] == 1) return;
        move[row][col] = 1;
        ret++;
        dfs(threshold, row + 1, col);
        dfs(threshold, row - 1, col);
        dfs(threshold, row, col + 1);
        dfs(threshold, row, col - 1);
        return;
    }
    
    public boolean check(int threshold, int row, int col){
        int sum = 0;
        while(row != 0){
            sum += row%10;
            row /= 10;
        }
        while(col != 0){
            sum += col%10;
            col /= 10;
        }
        if(threshold >= sum) return true;
        else return false;
    }
}