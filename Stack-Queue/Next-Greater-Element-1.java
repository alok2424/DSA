import java.util.*;
class Soltuion{
    public static int[] NGE(int[] nums1,int[] nums2){
        int n1 = nums1.length;
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        int n2 = nums2.length;
        int[] result = new int[n1];
        Stack<Integer> stack = new Stack<>();

        for(int i = n2-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums2[i]){
                stack.pop();
            }
            int nextGreater = stack.isEmpty() ? -1 : stack.peek();
            //storing nge for every element in nums2 in a map
            nextGreaterMap.put(nums2[i],nextGreater);
            stack.push(nums2[i]);
        }
        //since ques is asking to return the next greater element for nums1 array
         for(int i=0;i<n1;i++){
            //learn this map method 
         result[i] = nextGreaterMap.getOrDefault(nums1[i], -1);//map.getorDefault(key,default);
         }
        return result;
    }
}