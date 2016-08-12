package algoritms;
import java.util.*;

public class FrogRiverOne {
  
  public int solution(int X, int[] A) {
    //X and array.length <= 100 000
    final int MAX_SIZE = 100000;
    if(X > MAX_SIZE || A.length > MAX_SIZE) return -1;
    
    int result = -1;
    Set<Integer> set = new HashSet<>();
    
    for(int i = 0; i < A.length; i++) {
      if(A[i] < 1 || A[i] > X) return -1;
      set.add(A[i]);
      if(set.size() == X) return i;
    }    
    
    return result;
  }

}
