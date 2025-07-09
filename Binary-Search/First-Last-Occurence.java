class Solution{
    private int firstOccurence(int[] arr,int target){
        int low = 0,high = arr.length-1;
        int first = -1;

        while(low<=high){
            int mid = low + (high - low)/2;

            if(arr[mid] == target){
                first = mid;
                high = mid-1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return first;
    }

    private int lastOccurence(int[] arr,int target){
        int low = 0,high = arr.length-1;
        int last = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                last = mid;
                low = mid+1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return last;
    }

    public int[] searchRange(int[] arr,int target){
        int first = firstOccurence(arr, target);
        int last = lastOccurence(arr, target);
        return new int[]{first,last};
    }
}