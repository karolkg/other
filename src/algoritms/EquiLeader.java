package algoritms;

import java.util.Stack;

public class EquiLeader {
  
  public int solution(int[] A) {
    int N = A.length;
    if(N < 2) return 0;
    
    int number = 0, prev = 0;
    Stack<Integer> stack = new Stack<>();
   
   for(int i = 0; i < N; i++) {
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
   
   int[] counter = new int[N];
   for(int i = 0;i < N; i++ ) {
       if(A[i] == candidate) {               
           number++;
           counter[i] = number;
       }
   }   
   
   //if is a leader in the array  
   if(!(number > (N / 2))) // no leader
     return 0;
   
   
   int result = 0, equi = 0;
   for (int i = 0; i < N - 1; i++) {
       if(A[i] == candidate) 
         result++;
        if(result > (i+1) / 2 && number - result > (N - 1 - i) / 2) {
                equi++;               
           }
       }
   return equi;
  }

}
