package algoritms;

public class MaxCounters {
  
  public int[] solution(int N, int[] A) {
    int[] C = new int[N];
    
    //going through array A
    int max = 0;
    for(int i = 0; i < A.length; i++) {
      if(A[i] > max && A[i] <= N) max = A[i];
      
      if( A[i] > N) {
        for( int j = 0; j < C.length; j++) {          
          C[j] = max;
          System.out.print(C[j] + " ");
        }
      }
      else C[A[i]-1]++;
    }    
    
    return C;
  }
}