package week1.kimdory;
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> c6e4c25d32b22ecd196841e4fe81251164fe9a24
>>>>>>> 727ceb23c060ed596644114d5b73009563cee5fb
import java.util.Scanner;

public class Chap_01_Q06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합");
		System.out.print("n값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println("n = " + n + ", i = " + i);
	}
	
	
}
