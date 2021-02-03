/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Jz58 {
    
    boolean ret = true;
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null) return true;
        return rec(pRoot.left, pRoot.right);
    }
    
    boolean rec(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if((left == null && right != null)
          || (left != null && right == null) || left.val != right.val){
            return false;
        }
        return rec(left.left, right.right);
        
    }
}