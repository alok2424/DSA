class Node{
    int data;
    Node left,right;
    Node(int _data){
        this.data =_data;
    }
}
class Solution{
    public boolean isBalanced(Node root){
        return dsfHeight(root) != -1;
    }
    
    private int dsfHeight(Node root){
       if(root == null) return 0;
       int lh = dsfHeight(root.left);
       if(lh == -1) return -1;
       int rh = dsfHeight(root.right);
       if(rh == -1) return -1;

       if(Math.abs(lh-rh)>1) return -1;

       return 1+ Math.max(lh,rh);
    }
}