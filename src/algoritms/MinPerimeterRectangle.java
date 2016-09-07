package algoritms;


public class MinPerimeterRectangle {

  public int solution(int n) {
    if(n < 1)
      return 0;
    
    int a = 0, b = 0;
    int i =  (int)Math.sqrt(n);  
    while(i > 0) {
      if(n % i == 0){
        a = i;
        break;
      }
      i--;        
    }
    b = n / a;
    return 2*(a + b);
  }
}
