class Solution{
    public int noOfRotation(int[] arr){
        int low = 0, high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while(low<= high){
            int mid = low + (high-low)/2;
            
            //if search space is already sorted
            if(arr[low]<=arr[high]){
              if(arr[low]<ans){
                ans = arr[low];
                index = low;
              }
              break;
            }

             //check the sorted left half
            if(arr[low] <= arr[mid]){
                if(arr[low]< ans){
                    ans = arr[low];
                    index = low;
                }
                low = mid+1;
            }
            // check the sorted right half
            else{
                if(arr[mid]<ans){
                    ans = arr[mid];
                    index = mid;
                }
                high = mid-1;
            }
        }
        return index;
    }
}