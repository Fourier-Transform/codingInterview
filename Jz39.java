public class Jz39 {
    boolean ret = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        rec(root);
        return ret;
    }
    
    public int rec(TreeNode root){
        if(root == null || ret == false){
            return 0;
        }
        int depthL = rec(root.left);
        int depthR = rec(root.right);
        if(depthL - depthR > 1 || depthR - depthL > 1){
            ret = false;
        }
        return 1+(depthL >= depthR ? depthL : depthR);
    }
}