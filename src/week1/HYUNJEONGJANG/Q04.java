package chap01_BasicAlgorithm.practice;

public class Q04 {

	static int med3(int a, int b, int c) {

		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else        // a>c>b
				return c;
		else if (a > c) // b>a>c
			return a;
		else if (b > c) // b>c>=a
			return c;
		else            // c>=b>a
			return b;
		

	}

	public static void main(String[] args) {

		System.out.println("(1,2,3) 중간값 : " + med3(1, 2, 3));
		System.out.println("(2,2,3) 중간값 : " + med3(2, 2, 3));
		System.out.println("(1,7,8) 중간값 : " + med3(1, 7, 8));
		System.out.println("(4,4,4) 중간값 : " + med3(4, 4, 4));
		System.out.println("(10,20,30) 중간값 : " + med3(10, 20, 30));
		System.out.println("(11,12,13) 중간값 : " + med3(11, 12, 13));
		System.out.println("(21,22,23) 중간값 : " + med3(21, 22, 23));
		System.out.println("(100,200,300) 중간값 : " + med3(100, 200, 300));
		System.out.println("(122,222,322) 중간값 : " + med3(122, 222, 322));
		System.out.println("(1000,2000,3000) 중간값 : " + med3(1000, 2000, 3000));
		System.out.println("(5,2,3) 중간값 : " + med3(5, 2, 3));
		System.out.println("(21,20,3) 중간값 : " + med3(21, 20, 3));
		System.out.println("(71,20,300) 중간값 : " + med3(71, 20, 300));

	}

}
