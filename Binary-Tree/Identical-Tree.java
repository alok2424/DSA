class Node{
    int data ;
    Node left,right;
    Node(int val){
        this.data = val;
    }
}

class solution{
    public boolean isSomeTrue(Node p , Node q){
        if(p == null || q == null) return (p==q);

        return (p.data == q.data) && isSomeTrue(p.left,q.left) && isSomeTrue(p.right,q.right);
    }
}