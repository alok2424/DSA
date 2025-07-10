import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements smaller than or equal to current element
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            // If stack is empty, no greater element to the right
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            // Push current element to stack
            stack.push(nums[i]);
        }
        return result;
    }
}
