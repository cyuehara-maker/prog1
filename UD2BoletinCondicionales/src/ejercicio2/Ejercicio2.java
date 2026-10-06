/*
 * Utiliza un operador ternario para calcular el valor absoluto de un número que se solicita al usuario por teclado.
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("x: ");
		Double x = s.nextDouble();
		
		x = x >= 0 ? x : -x;
		
		System.out.println(x);
		
		s.close();
	}
}
