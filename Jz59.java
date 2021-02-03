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
public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> layer = new LinkedList<>();
        int layerNum = 0;
        if(pRoot == null) return ret;
        queue.add(pRoot);
        layer.add(layerNum);
        while(!queue.isEmpty()){
            pRoot = queue.poll();
            layerNum = layer.poll();
            temp.add(pRoot.val);
            if(pRoot.left != null){
                queue.add(pRoot.left);
                layer.add(layerNum + 1);
            }
            if(pRoot.right != null){
                queue.add(pRoot.right);
                layer.add(layerNum + 1);
            }
            if(layer.isEmpty() || layerNum == layer.peek() - 1){
                if(layerNum%2 == 1){
                    Collections.reverse(temp);
                }
                ret.add(new ArrayList<Integer>(temp));
                temp = new ArrayList<Integer>();
            } 
        }
        return ret;
    }

}