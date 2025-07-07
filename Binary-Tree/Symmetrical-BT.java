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
       if(left == null || right == null) return (left == right);//Since we want to check for each node 
       //there we will check till we do not found any node with different value
       if(left.data != right.data) return false;
       //if(left.data != right.data) return true;//Stops immediately when values match

       return isSymmetricHelp(left.left,right.right) && isSymmetricHelp(left.right, right.left);
    }

}