import java.util.*;
class StockSpanner{
    //stack stores: prices and index in array
    private Stack<int[]> st;
    private int index;

   //cosntructor
    public StockSpanner(){
        st = new Stack<>();
        index = -1;
    }


   //Method to compute stock span
   public int next(int price){
    index++;
    //store only prices greater than current index
    //so if peek element in the stack is less than or equal to current value then pop it 
    while(!st.isEmpty() && st.peek()[0]<=price){
       st.pop();
    }
    //find previousGreaterIndex
    int previousGreaterIndex = st.isEmpty() ? -1 : st.peek()[1];
    //find the span value
    int span = index - previousGreaterIndex;

    //push price and index into stack
    st.push(new int[]{price,index});
    return span;
   }
}