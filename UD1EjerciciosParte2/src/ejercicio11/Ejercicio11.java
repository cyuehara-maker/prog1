package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("edad: ");
		Integer edad = s.nextInt();
		System.out.print("permiso de conducir (true/false): ");
		Boolean permiso = s.nextBoolean();
		System.out.print("sancion (true/false): ");
		Boolean sancion = s.nextBoolean();
		
		System.out.println(edad >= 18 && permiso && !sancion);
		
		s.close();
	}

}
