package chap01_BasicAlgorithm.practice;

import java.util.Scanner;

public class Q10 {
	
	// 양의 정수를 입력하고 자릿수를 출력하는 프로그램

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수를 입력하세요 : ");
		int a = sc.nextInt();

		System.out.println(a + "는 " + (int) (Math.log10(a) + 1) + "자리 입니다.");

		
		// 반복문으로

		int count = 0;
		

		while ((a / 10) > 0) { 

			a /= 10;
			count++;
		}
		System.out.println(count + 1);
		
		
		while (a != 0) { 

			a /= 10;
			count++;
		}
		System.out.println(count);

	}

	
	
	
}
