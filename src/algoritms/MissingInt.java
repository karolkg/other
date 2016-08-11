package algoritms;

import java.util.Set;
import java.util.TreeSet;

public class MissingInt {
  
  public int solution(int[] A) {
    int result = 0;
    Set<Integer> set = new TreeSet<>();
    
    for(int i = 0; i < A.length; i++) {
        if(A[i] < 1) continue;
        else set.add(A[i]);            
    }
    
    for(int i = 1; i < Integer.MAX_VALUE; i++) {
     if(!set.contains(i)) return i ;
    }
    return result;
}

}
