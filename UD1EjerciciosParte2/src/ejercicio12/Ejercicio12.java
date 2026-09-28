package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("edad: ");
		Integer edad = s.nextInt();
		
		System.out.println("precio: " + (edad < 18 ? "6,50" : "9,50"));
		
		s.close();
		
	}

}
