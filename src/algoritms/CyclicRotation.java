package algoritms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CyclicRotation {

  public CyclicRotation() {
  }
  
  public int[] solution(int[] tab, int k) {
    int length = tab.length;
    //limits of length of array
    if(length < 1 || length > 100) return tab;
         
    List<Integer> intList = IntStream.of(tab).boxed().collect(Collectors.toList());
    Collections.rotate(intList, k);
    
    for(int i = 0; i < intList.size(); i++) {   
      if(tab[i] > 1000) tab[i] = 1000;
      if(tab[i] < -1000) tab[i] = -1000;    
      tab[i] = intList.get(i);
    }
    return tab;
  }
  
}
