package algoritms;

public class CountNonDivisible {
    
  

  public int[] solution( int[] A) {
    int len = A.length;
    int[] result = new int[len];
    
    for(int i = 0; i < len; i++) {
      int val = A[i];
      int count = 0;
      for(int j = 0; j < len; j++) {
        if(val % A[j] != 0)
          count++;
      }
      result[i] = count;
        
    }    
    
    return result;
  }
 
}
