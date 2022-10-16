package week1.kimdory;
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
