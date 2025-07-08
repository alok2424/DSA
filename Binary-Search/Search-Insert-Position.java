class Solution{
    public static int floor(int[] arr,int n, int target){
        int low= 0, high = arr.length-1;
        

        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }

        }
        return low;
    }
}