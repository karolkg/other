package algoritms;

public class FrogJmp {

	public int solution(int i, int j, int k) {
		int result = (j-i) / k;
		if(result * k < (j - i)) result += 1;
		
		return result;
	}

}
