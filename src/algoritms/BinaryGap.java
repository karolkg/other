package algoritms;

public class BinaryGap {
  
  public BinaryGap() {
  }
  
  public int solution(int n) {
    int counter = 0;
    int gap = 0;
    boolean flag = false;
    int mask = 1;
    
    for(int i = 0; i < 32; i++) {
      if((n & mask) == 0 && flag) {
        counter += 1;        
      }
      
      if((n & mask) == mask) {
        flag = true;        
        gap = gap > counter? gap: counter;
        counter = 0;        
      }      
     mask =  mask << 1;
    }
    return gap;
  }

  public static void main(String[] args) {
    BinaryGap bg = new BinaryGap();
    int result = bg.solution(129);
    System.out.println(result);
  }

}
