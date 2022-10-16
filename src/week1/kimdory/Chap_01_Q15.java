package week1.kimdory;
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> c6e4c25d32b22ecd196841e4fe81251164fe9a24
>>>>>>> 727ceb23c060ed596644114d5b73009563cee5fb
import java.util.Scanner;

public class Chap_01_Q15 {

	static void spira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++)
				System.out.print(' ');
			for(int j=1; j<=(i-1)*2+1; j++)
				System.out.print("*");
				System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.print("단수를 입력해주세요 : ");
			n = sc.nextInt();
		} while (n <= 0);
		
		spira(n);
	}
}
