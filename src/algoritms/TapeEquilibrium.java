package algoritms;

public class TapeEquilibrium {
	
	public int solution(int[] A) {
		int finalResult = Integer.MAX_VALUE;		
		int[] B = new int[A.length];
		B[0] = A[0];
		for(int i = 1; i <= A.length - 1; i++) {				
			B[i] = B[i - 1] + A[i];			
		}
	
		
		for(int i = 0; i < (A.length - 1); i++) {
			
			int res = Math.abs(B[i] - (B[A.length - 1] - B[i]));
	
			if(res < finalResult) finalResult = res;
				
		}
			
		return finalResult;
	}

}
