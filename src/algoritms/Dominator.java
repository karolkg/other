package algoritms;
import java.util.Stack;

public class Dominator {

   public int solution(int[] A) {
       int number = 0, prev = 0;
       Stack<Integer> stack = new Stack<>();
       
       for(int i = 0; i < A.length; i++) {
           if(stack.size() == 0) {
               stack.push(A[i]);
               prev = A[i];
           }
           else if(A[i] == prev) {
               stack.push(A[i]);
           }
           else {
               stack.pop();                
           }
       }
       int candidate = 0;
       if(stack.size() > 0)
           candidate = stack.pop();
       
       for(int i = 0;i < A.length; i++ ) {
           if(A[i] == candidate)
               number++;
       }
       
       if(number > (A.length / 2)) {
           for(int i = 0; i < A.length; i++) {
               if(A[i] == candidate) 
                   return i;
           }
       }
           
       return -1;
       
   }
}

