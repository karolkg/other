package algoritms;

public class OddOccurrencesInArray {
  
  public int solution(int[] array) {
    if(array.length < 1 || array.length > 1000000 || (array.length%2 == 0)) return -1;
    
    
    int result = -1;
    
    for(int i = 0; i < array.length; i++) {
      result = array[i];
      if(result < 1 || result > 1000000000) return -1;
      
      for(int j = i + 1; j < array.length; j++) {        
        if(array[i] == array[j])  break;
        if(j == array.length - 1) {
          if(i == j - 1) return array[i+1];
          else  return array[i];
        }
      }
    }
    
    return result;
  }

}
