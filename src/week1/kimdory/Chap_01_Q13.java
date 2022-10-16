package week1.kimdory;
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> c6e4c25d32b22ecd196841e4fe81251164fe9a24
>>>>>>> 727ceb23c060ed596644114d5b73009563cee5fb
import java.util.Scanner;

public class Chap_01_Q13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("정사각형을 출력합니다.");

		do {
			System.out.print("변의 길이 : ");
			n = sc.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
