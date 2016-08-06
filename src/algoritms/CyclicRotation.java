package algoritms;

public class CyclicRotation {

  public CyclicRotation() {
  }
  
  public int[] solution(int[] tab, int k) {
    int length = tab.length;
    if(length < 1 || length > 100) return tab;
    int[] newTab = new int[length];
    
    if(k > length) {
      System.out.println("Invalid arguments");
      System.exit(1);
    }
    
    
    for(int i = 0; i < length; i++) {
      if(tab[i] > 1000 || tab[i] < -1000) {
        System.out.println("Wrong value in array");
        System.exit(1);
      }
      if(i + k > length - 1) {
        newTab[i + k - length] = tab[i];
      }
      else   newTab[i + k] = tab[i];
    } 
    
    return newTab;
  }
  
}
