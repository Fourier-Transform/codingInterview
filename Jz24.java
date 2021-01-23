import java.util.ArrayList;
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
public class Jz24 {
    
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        recur(root, target, arr, 0, ret);
        return ret;
    }
    
    public void recur(TreeNode root, int target, ArrayList<Integer> arr, int sum, ArrayList<ArrayList<Integer>> ret){
        if(root == null) return;
        arr.add(root.val);
        if(root.val == target - sum && root.left == null && root.right == null){
            ret.add(arr);
            return;
        }else{
            recur(root.left, target, new ArrayList<Integer>(arr), sum + root.val, ret);
            recur(root.right, target, new ArrayList<Integer>(arr), sum + root.val, ret);
        }
    }
}