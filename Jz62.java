/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Jz62 {
    int order ,ret;
    public int kthLargest(TreeNode root, int k) {
        
        order = 0;
        ret = -1;
        dfs(root, k);
        return ret;
    }

    void dfs(TreeNode root, int k){
        if(root == null || ret != -1) return;
        dfs(root.right, k);
        order++;
        if(order == k){
            ret = root.val;
            return;
        }
        dfs(root.left, k);
        
    }
}