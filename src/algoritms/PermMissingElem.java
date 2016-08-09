package algoritms;

public class PermMissingElem {

	public int solution(int[] A) {
		int result = 0;
		if(A.length == 0) return 1;
		
		int B[] = new int[A.length + 1]; 
		
		for(int i = 0; i < A.length; i++) {
			B[ A[i] - 1  ] = 1;
		}
				
		for(int i = 0; i < B.length; i++) {
			if(B[i] == 0) return i + 1;
		}
		
		return result;
	}

}
