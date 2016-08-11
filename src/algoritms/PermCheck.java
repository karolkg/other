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

  
  public static void main(String[] args) {
    int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
    PermCheck pch = new PermCheck();

    long t1 = System.currentTimeMillis();

    // Version 1: use reduce method.
    for (int i = 0; i < 10000000; i++) {
        pch.solution(array);
    }

    long t2 = System.currentTimeMillis();

    // Version 2: use for-loop.
    for (int i = 0; i < 10000000; i++) {
        pch.solution2(array);
    }

    long t3 = System.currentTimeMillis();

    // ... Times.
    System.out.println(t2 - t1);
    System.out.println(t3 - t2);
  }
}
