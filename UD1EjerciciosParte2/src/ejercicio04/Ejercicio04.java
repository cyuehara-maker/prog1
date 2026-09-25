package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("x: ");
		Double x = s.nextDouble();
		
		System.out.println("redondeado abajo: " + Math.floor(x));
		System.out.println("redondeado arriba: " + Math.ceil(x));
		System.out.println("redondeado: " + Math.round(x));
		
		s.close();
		
	}

}
