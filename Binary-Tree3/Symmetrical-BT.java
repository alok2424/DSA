class Node{
    int data;
    Node left,right;
    Node(int _data){
        this.data = _data;
    }
}
class Solution{
    public boolean isSymmetric(Node root){
        if(root == null) return true;
        return isSymmetricHelp(root.left,root.right);
    }
    private boolean isSymmetricHelp(Node left,Node right){
        //base condition
       // if(root.left == null || root.right == null) return left==right;
       if(left == null || right == null) return (left==right);
       
       if(left.data != right.data) return false;
        return isSymmetricHelp(left.left,right.right) && isSymmetricHelp(left.right,right.left);
    }
}