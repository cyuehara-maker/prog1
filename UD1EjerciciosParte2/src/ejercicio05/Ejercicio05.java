package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("x: ");
		Double x = s.nextDouble();
		
		System.out.println("valor absoluto: " + Math.abs(x));
		System.out.println("raiz: " + Math.sqrt(x));
		
		s.close();
		
	}

}
