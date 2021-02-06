public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        String s = new String(str);
        String p = new String(pattern);
        int m = s.length() + 1, n = p.length() + 1;
        boolean[][] dp = new boolean[m][n];
        dp[0][0] = true;
        for(int j = 2; j < n; j+=2){
            dp[0][j] = dp[0][j-2] && p.charAt(j - 1) == '*';
        }
        s = "0" + s;
        p = "0" + p;
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(p.charAt(j) == '*'){
                    if(dp[i][j-2]) dp[i][j] = true;
                    else if(dp[i][j-1]) dp[i][j] = true;
                    else if(dp[i-1][j] && s.charAt(i)==p.charAt(j-1)) dp[i][j] = true;
                    else if(dp[i-1][j] && p.charAt(j-1) == '.') dp[i][j] =true;
                }else{
                    if(dp[i-1][j-1] && s.charAt(i) == p.charAt(j)) dp[i][j] = true;
                    else if(dp[i-1][j-1] && p.charAt(j) == '.') dp[i][j] = true;
                }
            }
        }
        return dp[m-1][n-1];
    }
}