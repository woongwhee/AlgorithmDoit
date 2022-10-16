package week1.kimdory;
<<<<<<< HEAD
=======
<<<<<<< HEAD


=======
>>>>>>> c6e4c25d32b22ecd196841e4fe81251164fe9a24
>>>>>>> 727ceb23c060ed596644114d5b73009563cee5fb
import java.util.Scanner;

public class Chap_01_Q02 {
	
	static int min3(int a, int b, int c) {
		int min = a;
		
		if( b < min ) min = b;
		if( c < min ) min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("최솟값 구하기");
		System.out.print("a : "); int a = sc.nextInt();	
		System.out.print("b : "); int b = sc.nextInt();		
		System.out.print("c : "); int c = sc.nextInt();
		
		int min = min3(a, b, c);
		
		System.out.println("최솟값 : " + min); 
		
	}

}
