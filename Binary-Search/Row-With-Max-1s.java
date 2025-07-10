class Solution{

    private int lb(int[] arr,int x){
        int low = 0, high = arr.length-1;
        int ans = arr.length;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] >= x){
                ans = mid;
               high =  mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int rowWithMax1(int[][] mat,int n, int m){
    int maxCnt = 0;
    int index = -1;
     
    for(int i=0;i<n;i++){
        int onesCnt =  m - lb(mat[i],1);
        if(onesCnt > maxCnt){
            maxCnt = onesCnt;
            index = i;
        }
    }
    return index;
}
}