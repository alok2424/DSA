
import java.util.ArrayList;



class TreeNode{
   int data;
   TreeNode left,right;
   TreeNode(int _data){
    this.data = _data;
   }
}

class Solution{
    boolean isLeaf(TreeNode node){
        return (node.left == null && node.right == null);
    }

    void addLeftBoundary(TreeNode root,ArrayList<Integer> res){
        TreeNode cur = root.left;
        while(cur != null){
            if(isLeaf(cur)) res.add(cur.data);
            if(cur.left != null) cur = cur.left;
            else cur = cur.right;
        }
    }

    void addRightBoundary(TreeNode root,ArrayList<Integer> res){
        TreeNode cur = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        
        while(cur!= null){
            if(!isLeaf(cur)) res.add(cur.data);
            if(cur.right != null) cur = cur.right;
            else cur = cur.left;
        }

        for(int i = temp.size() ; i>=0; --i){
             res.add(temp.get(i));
        }
    }
    
    void addLeaves(TreeNode root,ArrayList<Integer> res){
        if(isLeaf(root)){
           res.add(root.data);
           return;
        } 
        //If above function work then no need to proceed to the below lines
        if(root.left != null) addLeaves(root.left, res);
        if(root.right != null) addLeaves(root.right, res);
    }

}