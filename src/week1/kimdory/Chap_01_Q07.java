package week1.kimdory;
import java.util.Scanner;

public class Chap_01_Q07 {
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합 구하기");
		
		System.out.print("n : "); int n = sc.nextInt();
		
		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
		
		System.out.println("1부터 n까지의 합 : " + sum);
		
	}
}
