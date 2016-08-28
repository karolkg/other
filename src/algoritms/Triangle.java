package algoritms;

public class Triangle {

  public int solution(int[] A) {
    if(A.length < 3) return 0;
    
    int result = 0;
    quicksort(A, 0, A.length-1);
    
    for(int i = 2; i < A.length; i++) {
      long a = A[i - 2];
      long b = A[i - 1];
      long c = A[i];
      if( a + b > c && a + c > b && b + c > a) return 1;      
    }   
    
    return result;
  }
  
  
  private void quicksort(int[] array, int left, int right) {
    int pivot = (left + right) / 2;
    int value = array[pivot];
    int i = left;
    int j = right;
    
    do {
      while(array[i] < value) i++;
      while(array[j] > value) j--;
      
      if(i <= j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
      }      
    } while(i <= j);
    
    if(j < left) quicksort(array, left, j);
    if(i > right) quicksort(array,i, right);
    
  }
  
}
