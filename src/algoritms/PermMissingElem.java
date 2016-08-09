package algoritms;

public class PermMissingElem {

	public int solution(int[] A) {
		int result = 0;
		int B[] = new int[A.length + 1]; 
		
		for(int i = 0; i < A.length; i++) {
			B[ A[i] - 1  ] = 1;
		}
		
		for(int i = 1; i < B.length; i++) {
			if(B[i] == 1) return i;
		}
		
		return result;
	}

}
