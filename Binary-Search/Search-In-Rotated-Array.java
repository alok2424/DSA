class Solution{
    public int searchElementInRotatedSorted(int[] arr,int target){
        int low = 0,high = arr.length-1;
        
        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid] == target){
                return mid;
            }
            //left half sorted
            else if(arr[low]<= arr[mid]){
               //check is target is lying in left half
               if(arr[low]<=target && target<= arr[mid]){
                   high = mid-1;
               }
               else {
                low = mid+1;
               }
            }
            //right half is sorted
            else{
               if(arr[mid] <= target && target<=arr[high]){
                  low = mid+1;
               }
               else {
                high = mid-1;
               }
            }
        }
           return -1;
    }
}