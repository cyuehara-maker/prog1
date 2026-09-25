package parte2;

import java.util.Scanner;

public class E008 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("m lanzados: ");
		double m = s.nextDouble();
		
		double cm = m * 100;
		System.out.println("cm: " + (int) cm);
		
		s.close();
		
	}
	
}
