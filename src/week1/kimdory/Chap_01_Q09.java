package week1.kimdory;
import java.util.Scanner;

public class Chap_01_Q09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a , b;
		
		while(true) {
			System.out.print("a : "); a = sc.nextInt();
			System.out.print("b : "); b = sc.nextInt();
			if(b > a) break;
			System.out.println("a보다 큰값을 입력해주세요.");
		}
		
		int result =(b-a);
		
		System.out.println("b-a는"+ result +"입니다.");
		
	}
}

