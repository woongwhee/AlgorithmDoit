package chap01_BasicAlgorithm.practice;

import java.util.Scanner;

public class Q16 {

	static void npira(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("단수 입력 : ");
		int n = sc.nextInt();

		npira(n);

	}

}
