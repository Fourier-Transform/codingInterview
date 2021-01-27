/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Jz38 {
    int maxDepth;
    public int TreeDepth(TreeNode root) {
        int depth = 0;
        maxDepth = depth;
        dfs(root, depth);
        return maxDepth;
    }
    
    public void dfs(TreeNode root, int depth){
        if(root == null) return;
        depth++;
        maxDepth = maxDepth > depth ? maxDepth : depth;
        dfs(root.left, depth);
        dfs(root.right, depth);
    }
}