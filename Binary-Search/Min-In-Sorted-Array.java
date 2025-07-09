class Solution{
    public int findMin(int[] arr){
        int low = 0, high = arr.length-1;
        int ans = Integer.MAX_VALUE;

        while(low<= high){
            int mid = low + (high-low)/2;
            
            //if search space is already sorted
            if(arr[low]<=arr[high]){
              ans = Math.min(ans,arr[low]);
              break;
            }
             //check the sorted left half
            if(arr[low] <= arr[mid]){
                ans = Math.min(ans,arr[low]);
                low = mid+1;
            }
            // check the sorted right half
            else{
                ans = Math.min(ans,arr[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
}