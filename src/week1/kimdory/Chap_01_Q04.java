package week1.kimdory;
import java.util.Scanner;

public class Chap_01_Q04 {

	static int med3(int a, int b, int c) {
		
		if(a >= b)
			if(b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if(a > b)
			return a;
		else if(b > c)
			return c;
		else
			return b;			
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("중앙값 구하기");
		
		System.out.print("a : "); int a = sc.nextInt();
		System.out.print("b : "); int b = sc.nextInt();
		System.out.print("c : "); int c = sc.nextInt();
		
		int med = med3(a, b, c);
		
		System.out.println("중앙값 : " + med);
		
		
		
	}
}
