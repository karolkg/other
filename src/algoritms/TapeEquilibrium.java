package algoritms;

public class TapeEquilibrium {
	
	public int solution(int[] A) {
		int finalResult = Integer.MAX_VALUE;		
		
		for(int p = 1; p <= A.length - 1; p++) {
			int result1 = 0, result2 = 0;
			//counting first part of array (0,P)
			for(int i = 0; i < p; i++) result1 += A[i];
			//counting second part of array <P,N)
			for(int i = p; i < A.length; i++) result2 +=A[i];
			System.out.println("1:" + result1 + " 2:" + result2);
			int res = Math.abs(result1 - result2);
			
			if(res < finalResult) finalResult = res;
		}		
		return finalResult;
	}

}
