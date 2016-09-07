package algoritms;

/**
 * function counts a max profit between two values in array
 * array holds prices of share in consecutive days
 * @return max profit between two prices
 * @author Karol
 *
 */

public class MaxProfit {
 
  //O(n**2)
  public int solution2(int[] A) {
    int N  = A.length;
    if(N <= 1)
      return 0;
    
    int maxProfit = 0;
    for(int i = 0; i < N; i++ ) {
      int maxRow = 0;
      for(int j = i; j < N; j++) {
        if(A[i] < A[j]){
          maxRow = Math.max(maxRow, A[j] - A[i]);
        }    
        maxProfit = Math.max(maxProfit, maxRow);
      }
    }        
    return maxProfit;
  }
  
  // O(n)
  public int solution(int[] A) {
    int N = A.length;
    if(N <= 1)
      return 0;
    int maxProfit = 0, diff = 0;
    int min = Integer.MAX_VALUE;
    
    for(int i = 0; i < N; i++) {
      if(A[i]<= min) {
        min = A[i];
      }
      else {
        diff = A[i] - min;
        maxProfit = Math.max(diff, maxProfit);         
      }
    }    
    return maxProfit;
  }
}
