class Node{
    int data;
    Node left,right;
    Node(int val){
        this.data = val;
    }
}
class Solution{
    public int maxDepth(Node root){
        if(root == null) return 0;//base condition

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1+Math.max(lh,rh);
    }
}