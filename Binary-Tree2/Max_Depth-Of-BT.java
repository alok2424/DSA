class Node{
    int data;
    Node left,right;
    Node(int _data){
        this.data = _data;
    }
}
class Solution{
    public int maxDepth(Node root){
        if(root == null) return 0;

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1+Math.max(lh,rh);
    }
}