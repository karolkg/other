package algoritms;

public class Fib {
  String result;
  public Fib() {  }
  
  public String countFib(int number) {
    int l1 = 0;
    int l2 = 1;
    StringBuilder sb = new StringBuilder();
    
    for(int i=0; i < number; i++) {
      sb.append(l1).append(" ");
      int tmp = l2;
      l2 = l1 + l2;
      l1 = tmp;
    }
    result = sb.toString().trim();
    return result;    
  }
  
  public long countFibReq(int number) {   
    if(number <= 1)  return number;    
    return countFibReq(number-1) + countFibReq(number - 2);        
  }
}
