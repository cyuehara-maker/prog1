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
		Integer x = Math.abs(s.nextInt());
	
		Integer cifra = x;
		Integer count = 0;
		while (cifra > 0) {
			cifra /= 10;
			count++;
		}

		Integer c = x;
		Boolean isCapicua = true;
		Integer index = 0;
		while (index < count) {
			Integer a = c % 10;
			Integer b = x / Math.powExact(10, count - 1) % 10;
			if (a != b) {
				isCapicua = false;
				break;
			}
			c %= 10;
			index++;
		}
		System.out.println(isCapicua);
		
		s.close();
		
	}
}
