package algoritms;

public class MinAvgTwoSlices {
  
  public int solution(int[] A) {
    if(A.length < 1) {
        return 0;
    }
    int min = 0;
    int minAvg = 10001;
    
    for(int i = 0; i < A.length - 1; i++) {
        int avg = A[i] + A[i + 1] / 2;
        if(avg < minAvg) {
            min = i;
            minAvg = avg;
        }
        
        if(i < A.length - 2) {
            avg = A[i] + A[i + 1] + A[i + 2] / 3;
            if(avg < minAvg) {
                min = i;
                minAvg = avg;
            }
        }
    }
    return min;
}

}
