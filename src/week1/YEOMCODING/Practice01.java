package week1.YEOMCODING;

import java.util.Scanner;

public class Practice01 {
	
	public static int Max4(int a, int b, int c, int d) {
		
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		if(d > max) {
			max = d;
		}
		
		return max;
	}
	
	public static int Min3(int a, int b , int c) {
		
		int min = a;
		if(b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		return min;
	}

	public static int Min4(int a, int b, int c, int d) {

		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		if (d < min) {
			min = d;
		}
		return min;
	}
	
	public static int med2(int a, int b, int c) {
		
		if(a>=b) {
			if(b>=c) {
				return b;  // a = b = c , a > b > c , a=b > c, a>b=c
			}else if(c>=a) {
				return a;  // c=a=b, c>a>b, c=a>b, c>a=b
			}else {
				return c;
			}
		}else if(a > c) { // b�� a���� �۴ٴ� �����Ͽ� a < b
			return a;
		}else if(b > c) {
			return c;
		}else {
			return b;
		}
	}
	
	public static void problem07() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1���� n������ ���� ���մϴ�");
		System.out.print("n�� : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
		
			sum += i;
			i++;
		}
		
		System.out.println("i�� ���� ? " + i + ", n��?? " + n + ", sum�� ����?" + sum );
	
		
	}
	
	
	public static int sumof(int a, int b) {
		
		int c  = (a+b)*((Math.abs(a-b)+1)/2);
		
		return c;
	}
	
	public static void sumof2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a�� : ");
		int a = sc.nextInt();
		
		int b;
		
		do {
			System.out.print("b�� : ");
			b = sc.nextInt();
			
			if(b<=a) {
			System.out.println("a���� ū ���� �Է��ϼ���!!");
			}
		}while(b <= a);
		
		System.out.println("b-a�� " + (b-a) + "�Դϴ�.");
		
	}
	
	public static void sumof03() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int count=0;
		
		while(a!=0) {
			a/=10;
			count++;
			
		}
		System.out.println(count);
	}
	
	public static void multi() {

		for (int i = 1; i <= 9; i++) {

			if (i == 1) {
				System.out.print(" |");
			}
			System.out.printf("%3s", i);
		}

		System.out.println("\n----+------------------------");

		for (int i = 1; i <= 9; i++) {
			System.out.print(i + "|");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3s", i * j);
			}
			System.out.println();
		}
	}

	public static void multi2() {

		for (int i = 1; i <= 9; i++) {

			if (i == 1) {
				System.out.print(" | ");
			}
			System.out.print(+i + " ");
		}

		System.out.println("\n----+-----------------");

		for (int i = 1; i <= 9; i++) {
			System.out.print(i + "| ");
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + j + " ");
			}
			System.out.println();
		}
	}
	public static void star01() {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		
		for(int i = 1; i<=a ; i++) {
			for(int j=1; j<=a;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void aaa() {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 1; i<=a ; i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void aaa2() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 0 ; i<a; i++) {
			for(int j = a; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void aaa3() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int j = a; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void aaa4() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			
			for(int j = a-1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void spira() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {

			for (int j = a - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for(int j = 0 ; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void spira2() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {

			for (int j = a - 1; j > i-1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i-1; j++) {
				System.out.print(i);
			}
			for(int j = 0 ; j<i-1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
