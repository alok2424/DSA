import java.util.*;
class solution{

    public static int[] asteroidCollision(int[] asteroids){
       Stack<Integer> stack= new Stack<>();
       for(int as: asteroids){
        if(as>0){
            stack.push(as);
        }
        else{
            while(!stack.isEmpty() && stack.peek()>0 && stack.peek()< Math.asb(as) ){
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek() > 0 && stack.peek() == Math.abs(as)){
                stack.pop();//destroy both of them
            }
            else if(stack.isEmpty() && stack.peek()<0){
                stack.push(as);
            }
        }
       }
       int[] result = new int[stack.size()];
       for(int i = result.length -1 ; i>=0 ; i--){
        result[i] = stack.pop();
       }
       return result;
    }
}