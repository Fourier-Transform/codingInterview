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
import java.util.*;
public class Jz61 {
    String Serialize(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp == null){
                sb.append("#,");
            }else{
                sb.append(Integer.toString(temp.val)+",");
                queue.add(temp.left);
                queue.add(temp.right);
            }
        }
        return sb.toString();
  }
    TreeNode Deserialize(String data) {
       String[] arr = data.split(",");
        if(arr[0].equals("#")) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode temp = new TreeNode(Integer.parseInt(arr[0]));
        TreeNode root = temp;
        queue.add(temp);
        int i = 1;
        while(!queue.isEmpty()){
            temp = queue.poll();
            if(!arr[i].equals("#")){
                temp.left = new TreeNode(Integer.parseInt(arr[i]));
                queue.add(temp.left);
            }
            i++;
            if(!arr[i].equals("#")){
                temp.right = new TreeNode(Integer.parseInt(arr[i]));
                queue.add(temp.right);
            }
            i++;
        }
        return root;
  }
}