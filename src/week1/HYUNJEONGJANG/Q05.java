package chap01_BasicAlgorithm.practice;

public class Q05 {
	
	static int med3(int a, int b, int c) {

		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}
	
	// 효율이 떨어지는 이유
	// b >= a 와 b <= a 에서 같은 케이스를 비교하는 경우가 중복으로 발생함.
	
	// 조건 검사를 여러번 하게됨

	public static void main(String[] args) {

	}

}
