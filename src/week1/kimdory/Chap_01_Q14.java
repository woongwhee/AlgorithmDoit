package week1.kimdory;
<<<<<<< HEAD

=======
>>>>>>> c6e4c25d32b22ecd196841e4fe81251164fe9a24
import java.util.Scanner;

public class Chap_01_Q14 {

	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i+1; j++)
				System.out.print('*');
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i-1; j++)
				System.out.print(' ');
			for (int j = 1; j <= n-i+1; j++)
				System.out.print('*');
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++)
				System.out.print(' ');
			for (int j = 1; j <= i; j++)
				System.out.print('*');
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
		
		System.out.println("왼쪽아래 이등변삼각형");
		triangleLB(n);
		
		System.out.println("왼쪽위 이등변삼각형");
		triangleLU(n);
		
		System.out.println("오른쪽위 이등변삼각형");
		triangleRU(n);
		
		System.out.println("오른쪽아래 이등변삼각형");
		triangleRB(n);

	}
}
