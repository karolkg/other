package Algoritms;

public class CyclicRotation {

  public CyclicRotation() {
  }
  
  public int[] solution(int[] tab, int k) {
    int lenght = tab.length;
    int[] newTab = new int[lenght];
    
    if(k > lenght) {
      System.out.println("K is to high");
      System.exit(1);
    }
    
    
    for(int i = 0; i < lenght; i++) {
      if(tab[i] > 1000 || tab[i] < -1000) {
        System.out.println("Wrong value in array");
        System.exit(1);
      }
      if(i + k > lenght - 1) {
        newTab[i + k - lenght] = tab[i];
      }
      else   newTab[i + k] = tab[i];
    } 
    
    return newTab;
  }
  
}
