import java.util.*;
class Solution{
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            //if it's opening bracket
            if(ch=='(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else{
                //if it's closing bracket
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(  (ch == ')' && top != '(')  ||
                      (ch == '}' && top !='{') || 
                      (ch == ']' && top != '[') )
                      return false;
            }
        }
        return stack.isEmpty();
    }
}