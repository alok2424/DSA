import java.util.*;
import javax.xml.transform.Templates;
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

    void AddLeftBoundary(TreeNode root,ArrayList<Integer> res){
        TreeNode cur = root.left;

        while( cur != null){
            if(!isLeaf(cur)) res.add(cur.data);
            if(cur.left != null) cur = cur.left;
            else cur = cur.right;
        }
    }

    void AddRightBoundary(TreeNode root,ArrayList<Integer> res){
        TreeNode cur = root.right;

        ArrayList<Integer> tmp = new ArrayList<>();

        while(cur != null){
            if(!isLeaf(cur)) tmp.add(cur.data);
            if(cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
        for(int i= tmp.size();i>=0;--i){
           res.add(tmp.get(i));
        }
    }

    void addLeaves(TreeNode root,ArrayList<Integer> res){
        if(isLeaf(root)){
        res.add(root.data);
        return;
        } 

        if(root.left != null) {
            addLeaves(root.left, res);
        }
        if(root.right != null){
            addLeaves(root.right, res);
        }
    }

    ArrayList<Integer> printBoundary(TreeNode node){
        ArrayList<Integer> ans = new ArrayList<>();
        if(node == null) return ans;
        if(!isLeaf(node)) ans.add(node.data);

        AddLeftBoundary(node,ans);
        addLeaves(node, ans);
        AddRightBoundary(node, ans);
        
        return ans;
    }

    
}