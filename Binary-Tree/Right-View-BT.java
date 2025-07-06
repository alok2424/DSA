import java.util.*;
class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int val){
        this.data = val;
    }
}

class Solution{
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        rightView(root,result,0);
        return result;
    }

    private void rightView(TreeNode curr,List<Integer> result , int level){
        if(curr == null){
            return;
        }
        if(level == result.size()){
            result.add(curr.data);
        }
        rightView(curr.right, result, level+1);
        rightView(curr.left,result , level+1);
    }
}