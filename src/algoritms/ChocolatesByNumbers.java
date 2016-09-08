package algoritms;
import java.util.*;


public class ChocolatesByNumbers {

  public int solution2(int N, int M) {
    int result = 0;
    Set<Integer> set = new HashSet<>();
    int index = 0;
    
    for(int i = 0; i < N; i++) {
      
      if(set.contains(index))
        break;
      else
        set.add(index);
      
      index = (index + M) % N;      
    }
    
    result = set.size();
    
    return result;
  }
  
  
  public int solution(int N, int M) { 
    if(N < 1)
      return 0;
    
    
    long lcm = (long)N * M / NWD(N, M); 
    System.out.println(NWD(N,M));
    return (int) lcm / M;
  }
  
  private long NWD(long N, long M) {    
    
    if(N % M == 0)
      return M;
    else
      return NWD(M, N % M);
    
  }

}
