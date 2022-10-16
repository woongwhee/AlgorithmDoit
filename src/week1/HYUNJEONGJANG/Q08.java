package chap01_BasicAlgorithm.practice;

import java.util.Scanner;

public class Q08 {

	// a,b 를 포함한 그 사이 모든 정수값의 합 구하여 반환하는 메서드 작성하기.

	static int sumof(int a, int b) {

		int sum = 0;

		if (a < b) {
			for (int i = a; i <= b; i++) {
				sum += i;
			}

		} else {
			for (int i = b; i <= a; i++) {
				sum += i;
			}

		}

		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();

		System.out.println("a 부터 b 사이의 정수 합 : " + sumof(a, b));

	}

}
