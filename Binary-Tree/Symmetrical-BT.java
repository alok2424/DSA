class Node{
    int data;
    Node left,right;
    Node(int val){
        this.data = val;
    }
}

class Solution{
    public boolean isSymmetric(Node root){
        return root == null || isSymmetricHelp(root.left,root.right);
    }

    private boolean isSymmetricHelp(Node left,Node right){
       if(left == null || right == null) return (left == right);
       if(left.data != right.data) return false;

       return isSymmetricHelp(left.left,right.right) && isSymmetricHelp(left.right, right.left);
    }
}