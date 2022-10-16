package chap01_BasicAlgorithm.practice;

public class Q11 {

	public static void main(String[] args) {
		
		System.out.print("   | ");
		
		for(int i = 1 ; i <= 9; i++) {
			System.out.print(" "+ i + " ");
		}
		System.out.println("\n---+---------------------------");
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(" " + i + " |");
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3s", i * j); 
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		// 서학
		for(int i = 1 ; i<=9; i++) { 
			if( i == 1) { 
				System.out.print("   | "); 
				} 
			System.out.print(" "+ i + " "); 
			} 
		System.out.println("\n---+---------------------------"); 
		for(int i = 1; i<=9 ; i++) { 
			System.out.print(" " + i +" |"); 
			for(int j = 1 ; j<=9; j++) { 
				System.out.printf("%3d" , i*j ); 
				} 
			System.out.println(); 
			} 

	}
	

}
