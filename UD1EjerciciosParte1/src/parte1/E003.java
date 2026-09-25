package parte1;

import java.util.Scanner;

public class E003 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("año actual: ");
		Integer actual = s.nextInt();
		System.out.println("año de nacimiento: ");
		Integer nacimiento = s.nextInt();
		
		System.out.println("edad: " + (actual - nacimiento));
		s.close();
		
	}

}
