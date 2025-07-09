import java.util.*;

class Solution {
    // Helper function to calculate the sum of ceil(arr[i] / div) for all i
    private int sumByDivisor(int[] arr, int div) {
        int sum = 0;
        for (int num : arr) {//foreach loop
            sum += (num + div - 1) / div; // integer-based ceil
        }
        return sum;
    }
    public int smallestDivisor(int[] arr, int limit) {
        int n = arr.length;
        //length of array is always less than threshold
        if (n > limit) return -1;

        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int total = sumByDivisor(arr, mid);//for optimisation

            if (total <= limit) {
                ans = mid;       // valid answer,
                high = mid - 1;// try to minimize
            } else {
                low = mid + 1;   // need a bigger divisor
            }
        }
        return ans;
    }
}
