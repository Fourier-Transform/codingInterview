/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    TreeLinkNode ret;
    boolean flag = false;
    boolean flag2 = false;
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        TreeLinkNode target = pNode;
        TreeLinkNode root = null;
        while(pNode != null){
            root = pNode;
            pNode = pNode.next;
        }
        ret = null;
        inOrder(root, target);
        return ret;
    }
    
    public void inOrder(TreeLinkNode root, TreeLinkNode target){
        if(root == null) return;
        inOrder(root.left, target);
        if(flag == true && flag2 == false){
            ret = root;
            flag2 = true;
            return;
        }
        
        if(root == target){
            flag = true;
        }
        inOrder(root.right, target);
    }
}