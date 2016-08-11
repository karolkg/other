package algoritms;

import static org.junit.Assert.assertEquals;

public class PermCheck {
  
  public int solution2(int[] A) {
    int arrayLength = A.length;
    if(arrayLength <= 0) return 0;
    
    int arraySum = 0, rightSum = 0;
    
    for(int i = 0; i < arrayLength; i++) {
      rightSum +=  i + 1;
      arraySum += A[i];        
    }
    if(arraySum == rightSum) return 1;
    return 0;
  }
  
  public int solution(int[] A) {
    int arrayLength = A.length;
    if(arrayLength < 1) return 0;
    int[] B = new int[arrayLength];
    
    
    for(int i = 0; i < arrayLength; i++) {
      if(A[i] > arrayLength || A[i] < 1) return 0;
      else B[A[i] - 1] = 1;      
    }
    
    for(int j = 0; j < B.length; j++) {
      System.out.print("j=" + j + " B[j]=" + B[j] + " ");
      if(B[j] == 0) return 0;
    }
    
    return 1;
  }

  public static void main(String[] args) {
    PermCheck pc = new PermCheck();
    int[] a = {};
    System.out.println("Result:" + pc.solution(a));
  }
}
