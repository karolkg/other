package algoritms;

import java.util.*;

public class OddOccurrencesInArray {
  
  public int solution(int[] array) {
 //   if(array.length < 1 || array.length > 1000000 || (array.length%2 == 0)) return -1;
    int result = -8;
    
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < array.length; i++) {
      if(array[i] < 1 || array[i] > 1e10) return -1;
      int value;      
      if( !map.containsKey(array[i]) ) value = 0;
      else value = map.get(array[i]);      
      
      map.put(array[i], value + 1);      
    }
    
    for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
      System.out.println("Key:" + entry.getKey() + " value: " + entry.getValue());
      if(entry.getValue() == 1) return entry.getKey();
    }
    
    return result;
  }

}
