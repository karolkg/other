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
        }
      }
      else C[A[i]-1]++;
    }    
    
    return C;
  }
  
    public int[] solution2(int N, int[] A) {
      int[] C = new int[N];
      
      for(int i =0; i < A.length; i++) {
          if(A[i] > N) {            
              int max = getMax(C);
              for(int j = 0; j < C.length; j++)
                  C[j] = max;
          }
          else C[ A[i] - 1]++;                
      }
      
      return C;
  }
  
  
  private int getMax(int[] values) {
    int max = Integer.MIN_VALUE;
    for(int value : values) {
            if(value > max)
                    max = value;
    }
    return max;
}
  
  public static void main(String[] args) { 
    final int N = 100000;
    int[] A = new int[1000000];
    int value = 1;
    for(int i = 0; i < A.length; i++) {
      if(i > N) value = 1;
      
      A[i] = value;
      
      value++;
    }
    
    
    long t1 = System.currentTimeMillis();
    
    new MaxCounters().solution(N, A);
    
    long t2 = System.currentTimeMillis();
    
    new MaxCounters().solution2(N, A);
    
    long t3 = System.currentTimeMillis();
    
    System.out.println("solution1:" + (t2 - t1));
    System.out.println("Solution2:" + (t3 - t1));
    
  }
}