package algoritms;

public class PermCheck {
  
  public int solution(int[] A) {
    int result = 0;
    int arrayLength = A.length;
    int[] B = new int[arrayLength];
    
    for(int i = 0; i < arrayLength; i++) {
      if(A[i] > arrayLength || A[i] < 1) return 0;
      else B[A[i] - 1] = 1;      
    }
    
    for(int i: B)
      if(B[i] == 0) return 0;
      else return 1;  
    
    return result;
  }

}
