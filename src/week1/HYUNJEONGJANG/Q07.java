package week1.HYUNJEONGJANG;

import java.util.Scanner;

public class Q07 {
	
	// 1~10의 합은 (1+10)*5와 같이 구할 수 있는데 이를 가우스의 덧셈 이라고 한다.
	// 이 방법을 이용해서 1부터 n까지의 정수의 합을 구하는 프로그램을 작성하시오.
	// (1 + n) * (n / 2) => 가우스 덧셈

	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);

		System.out.print("n : ");
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println((1 + n) * (n / 2));
		} else {
			System.out.println((1 + n) * (n / 2) + ((n + 1) / 2));
		}
		
		
		// 반복문으로?
		
		for (int i = 1; i < n; i++) {
			if (i == 1) {
				System.out.println((i + n) * n / 2);
			}
		}
		

	}

}
