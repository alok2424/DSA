class Node{
    int data;
    Node left,right;
    Node(int val){
        this.data = val;
    }
}
class Solution{
    public boolean isBalanced(Node root){
        return dfsHeight(root) != -1;
    }
    private int dfsHeight(Node root){
        if(root == null) return 0;

        int lh = dfsHeight(root.left);
        if(lh == -1) return -1;
        int rh = dfsHeight(root.right);
        if(rh == -1) return -1;

        if(Math.abs(lh-rh)>1) return -1;
        return 1+ Math.max(lh,rh);
    }
}