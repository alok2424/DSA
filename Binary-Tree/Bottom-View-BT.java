import java.util.*;
class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int val){
        this.data= val;
    }
}
class Pair{
    TreeNode node;
    int hd;
    Pair(TreeNode _node,int _hd){
        this.node = _node;
        this.hd = _hd;
    }
}
class Solution{
    public ArrayList<Integer> botttomView(TreeNode root){
     ArrayList<Integer> ans = new ArrayList<>();
     if(root == null) return ans;
     Map<Integer,Integer> map = new TreeMap<>();
     Queue<Pair> q=  new LinkedList<>();

     q.add(new Pair(root,0));

     while(!q.isEmpty()){
        Pair it = q.poll();
        TreeNode temp = it.node;
        int hd = it.hd;

        map.put(hd,temp.data);

        if(temp.left != null){
         q.add(new Pair(temp.left,hd-1));
        }
        if(temp.right != null){
            q.add(new Pair(temp.right, hd+1));
        }
     }
     for(int value: map.values()){
        ans.add(value);
     }
     return ans;
    }
}