/*
 * Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999.
 * La aplicación tendrá que indicar si el número introducido es capicúa.
 * Un número es capicúa si se lee igual de izquierda a derecha que de derecha a izquierda.
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("x: ");
		Integer x = s.nextInt();
	
		Integer cifra = x;
		Integer count = 0;
		while (cifra > 0) {
			cifra /= 10;
			count++;
			System.out.println(count);
		}
		
		Integer a, b;
		Integer index = 0;
		while (index < count) {
			a = x % 10;
			b = x / Math.powExact(10, count) % 10;
			if (a != b) {
				System.out.println("no");
				break;
			}
			x %= 10;
			index++;
		}
		
		s.close();
		
	}
}
