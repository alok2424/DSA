import java.util.*;
class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int _data){
        this.data = _data;
    }
}

class Solution{
    public static List<Integer> RightSideView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        rightView(root,result,0); //doubt result ->0
        return result;
    }
    private static void rightView(TreeNode node,List<Integer> result, int level){
        if(node == null) return ;
        if(level == result.size()){
            result.add(node.data); //doubt
        }
        rightView(node.right, result, level+1);
        rightView(node.left, result, level+1);
    }
}