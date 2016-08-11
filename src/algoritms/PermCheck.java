package algoritms;

public class PermCheck {
  
  public int solution(int[] A) {
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
  
  public int solution2(int[] A) {
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

  
  public static void main(String[] args) {
    final int MAX = (int)1e8;
    int[] array = new int[MAX];
    for(int i: array) array[i] = i;
    
    PermCheck pch = new PermCheck();

    long t1 = System.currentTimeMillis();

    // Version 1: use reduce method.
  //  for (int i = 0; i < 10000000; i++) {
        pch.solution(array);
 //   }

    long t2 = System.currentTimeMillis();

    // Version 2: use for-loop.
//    for (int i = 0; i < 10000000; i++) {
        pch.solution2(array);
  //  }

    long t3 = System.currentTimeMillis();

    // ... Times.
    System.out.println("solution1:" + (t2 - t1));
    System.out.println("solution2:" + (t3 - t2));
  }
}
