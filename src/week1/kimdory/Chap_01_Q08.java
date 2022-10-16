import java.util.Scanner;

public class Chap_01_Q08 {
	
	static int sumof(int a, int b) {
		
		int min;
		int max;

		if (a < b) {
			min = a;  max = b;
		} else {
			min = b;  max = a;
		}

		int sum = 0;
		
		for (int i = min; i <= max; i++)
			sum += i;
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a부터 b까지의 합 구하기");
		
		System.out.print("a : "); int a = sc.nextInt();
		System.out.print("b : "); int b = sc.nextInt();
		
		System.out.println("a부터 b까지의 합 : " + sumof(a,b));
		
		

	}
}
