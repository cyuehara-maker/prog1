package parte1;

import java.util.Scanner;

public class E009 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("edad: ");
		Integer edad = s.nextInt();

		boolean mayorDeEdad = edad >= 18;
		
		if (mayorDeEdad) {
			System.out.println("mayor de edad");
		} else {
			System.out.println("menor de edad");
		}
		
		s.close();
	}

}
