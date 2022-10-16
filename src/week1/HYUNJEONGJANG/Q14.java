package chap01_BasicAlgorithm.practice;

import java.util.Scanner;

public class Q14 {

	static void triangleLB(int n) {
		// 왼쪽 아래가 직각인 이등변삼각형을 출력

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	

	static void triangleLU(int n) {
		// 왼쪽 위가 직각인 이등변삼각형을 출력

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	

	static void triangleRU(int n) {
		// 오른쪽 위가 직각인 이등변삼각형을 출력

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	static void triangleRB(int n) {
		// 오른쪽 아래가 직각인 이등변삼각형을 출력

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();

		}
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();

		System.out.println("왼쪽 아래가 직각인 이등변삼각형");
		triangleLB(n);

		System.out.println("왼쪽 위가 직각인 이등변삼각형");
		triangleLU(n);

		System.out.println("오른쪽 위가 직각인 이등변삼각형");
		triangleRU(n);

		System.out.println("오른쪽 아래가 직각인 이등변삼각형");
		triangleRB(n);

	}

}
