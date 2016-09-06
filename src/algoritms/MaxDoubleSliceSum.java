package algoritms;

public class MaxDoubleSliceSum {  
  
  public int solution( int[] A) {
    int N = A.length;
    //if array has less than 3 elaments return 0
    if(N <= 3)
      return 0;  
    int[] A1 = new int[N];
    int[] A2 = new int[N];
    
    for(int i = 1; i <  N - 1; i++) {
      A1[i] = Math.max(A1[i - 1] + A[i], 0);
    }
    
    for(int e : A1) {
      System.out.print(e + " ");      
    }
    
    for(int i = N-2; i > 0; i--){
      A2[i] = Math.max(A2[i+1]+A[i], 0);
    }
    
    System.out.println();
    for(int e: A2 ) {
      System.out.print(e + " ");
    }
    
    int max = 0;

    for(int i = 1; i < N-1; i++){
      max = Math.max(max, A1[i-1]+A2[i+1]);
    }

    return max;   
  }

}
