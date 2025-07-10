
import java.util.Stack;

class Solution{
    public int[] nge(int[] nums){
        int n = nums.length-1;
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[n];
        for(int i=nums.length-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()<= nums[i]){
                stack.pop();
            }
             nge[i] = stack.isEmpty() ? -1: stack.peek();
            stack.push(nums[i]);
        }
      return nge;
    }
}