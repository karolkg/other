package algoritms;

public class Fish {
  
  public int solution(int[] A, int[] B) {
    //number of living fish
    int fishAlive = 0;
    //stack for fish going downstream. We keep size in array and number in num variable
    int[] down = new int[A.length];
    int num = 0;
     
    
    
    for(int i = 0; i < A.length; i++) {
 //     System.out.println("FA:" + fishAlive + " num:" + num + " i:" + i);
      if(B[i] == 0 && num == 0) {
        fishAlive += 1;
      }
        
      if(B[i] == 0 && num > 0) {
         while(num > 0) {
                      
           if(A[i] > down[num-1]) {
             num--;          
           }   
           else {
             
             break;
           }
         }
         if (num == 0)
           fishAlive += 1;
       }
        
       if(B[i] == 1) {
          down[num++] = A[i];
        }              
    }       
   
    
    return fishAlive + num;
  }
}