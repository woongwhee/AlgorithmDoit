package week1.HYUNJEONGJANG;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("a : ");
		int a = sc.nextInt();

		while (true) {

			System.out.print("b : ");
			int b = sc.nextInt();

			if (a < b) {
				System.out.println("b-a는 " + (b - a) + "입니다.");

			} else {

				System.out.println("a보다 큰 값을 입력하세요!");

			}
		}

	}

}
