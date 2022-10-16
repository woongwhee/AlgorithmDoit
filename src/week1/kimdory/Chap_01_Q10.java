package week1.kimdory;
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> c6e4c25d32b22ecd196841e4fe81251164fe9a24
>>>>>>> 727ceb23c060ed596644114d5b73009563cee5fb
import java.util.Scanner;

public class Chap_01_Q10 {
	
	static int pn(int num)
	{
		int i=0;
		for(i=0; num!=0; i++)
		{
			num/=10;
		}
		return i;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		System.out.println("그 수는 " + pn(num) + "자리입니다.");
		
	}
}
