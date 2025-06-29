import java.util.*;
class NSL{
  public static int[] NSL(int[] nums){
      int n = nums.length;
      int[] result = new int[n];
      Stack<Integer> stack = new Stack<>();

      for(int i=0;i<n;i++){
     while(!stack.isEmpty() && stack.peek()>=nums[i]){
        stack.pop();
      }
      result[i] = stack.isEmpty()? -1 : stack.peek();

      stack.push(nums[i]);
      }  
      return result;
  }
}