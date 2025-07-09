class Solution{
    private int pow(int x,int n){
        long result = 1;
        for(int i =1;i<=n;i++){
           result*= x;
           //for dealing with high power
           if(result> Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }
        return (int) result;
    }
    public int nthRoot(int n,int m){
        int low =1 , high = m;
        while(low<=high){
            int mid  = low + (high-low)/2;
            int midPower = pow(mid,n);//for optimisation
            if(midPower== m){
                return mid;
            }
            else if(midPower<m){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}