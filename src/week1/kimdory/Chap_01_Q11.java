package week1.kimdory;
<<<<<<< HEAD
=======
<<<<<<< HEAD

=======
>>>>>>> c6e4c25d32b22ecd196841e4fe81251164fe9a24
>>>>>>> 727ceb23c060ed596644114d5b73009563cee5fb
public class Chap_01_Q11 {

	public static void main(String[] args) {
		
		System.out.print("   |");
		
		for (int i = 1; i <= 9; i++)
			System.out.printf("%3d", i);
		System.out.println("\n---+---------------------------");
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i);
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i*j);
			System.out.println();
		}
	}
}
