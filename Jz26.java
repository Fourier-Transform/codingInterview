/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Jz26 {
    Node pre = null, head = null;
    public Node treeToDoublyList(Node root) {
        if(root == null) return null;
        dfs(root);
        pre.right = head;
        head.left = pre;
        return head;
    }

    public void dfs(Node root){
        if(root == null) return;
        dfs(root.left);
        if(pre != null){
            pre.right = root;
            root.left = pre;
        }else{
            head = root;
        }
        pre = root;
        dfs(root.right);
    }
}