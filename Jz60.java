import java.util.*;

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
public class Jz60 {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> layer = new LinkedList<>();
        int layerNum = 0;
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<>();
        if(pRoot == null) return ret;
        queue.add(pRoot);
        layer.add(layerNum);
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            layerNum = layer.poll();
            temp.add(cur.val);
            if(cur.left != null){
                queue.add(cur.left);
                layer.add(layerNum+1);
            }
            if(cur.right != null){
                queue.add(cur.right);
                layer.add(layerNum+1);
            }
            if(queue.isEmpty() || layer.peek() == layerNum + 1){
                ret.add(new ArrayList<Integer>(temp));
                temp = new ArrayList<Integer>();
            }
        }
        return ret;
    }
    
}