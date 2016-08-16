package algoritms;

public class PassingCars {
	
	public int solution(int[] A) {
		if(A.length > 100000) return -1;
		
		int result = 0;
		int[] sumElem = new int[A.length + 1];
		
		//making a cumulative table
		//if value in the table is different than 0 or 1 return -1
		for(int i = 1; i < sumElem.length; i++) {
			if(A[i - 1] < 0 || A[i - 1] > 1) return -1;
			sumElem[i] = sumElem[i - 1] + A[i - 1];
		}
		
		int sumAll = sumElem[ sumElem.length - 1];	
		for(int i = 0; i < A.length; i++) {
			if(A[i] == 0) {
				result += sumAll - sumElem[i];
				if(result > (long)1e9 || result < -1 ) return -1;
			}
		}		
		return result;
	}
}
