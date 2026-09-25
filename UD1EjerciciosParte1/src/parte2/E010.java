package parte2;

import java.util.Scanner;

public class E010 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("año: ");
		Integer year = s.nextInt();
		System.out.println("siglo: " + (year / 100 + 1));
		
		s.close();
		
	}

}
