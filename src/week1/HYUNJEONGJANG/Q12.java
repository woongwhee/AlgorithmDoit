package week1.HYUNJEONGJANG;

public class Q12 {

	public static void main(String[] args) {
		
		System.out.print("   | ");
		
		for(int i = 1 ; i <= 9; i++) {
			System.out.print(i + "  ");
		}
		System.out.println("\n---+---------------------------");
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(" " + i + " |");
			for (int j = 1; j <= 9; j++)
				System.out.print(" " + (i + j) + " "); 
			System.out.println();
		}

	}

}
