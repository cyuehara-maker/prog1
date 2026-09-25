package parte1;

import java.util.Scanner;

public class E002 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("edad actual: ");
		Integer x = s.nextInt();
		System.out.println("edad para el siguiente año: " + (x + 1));
		
		s.close();
		
	}

}
