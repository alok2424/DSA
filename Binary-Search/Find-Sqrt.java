class Solution{
    public int sqrt(int num){
        if(num == 0 || num == 1) return num;

        int low= 1,high = num, ans = -1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(mid <= num/mid){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}