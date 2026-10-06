/*
 * Realiza el “juego de la suma”, que consiste en que aparezcan dos números aleatorios
 * (comprendidos entre 1 y 99) y el usuario tiene que sumarlos.
 * La aplicación le pedirá al usuario que introduzca el resultado de la suma.
 * La aplicación le indicará si el resultado es correcto o no.
 */
package ejercicio4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		Integer x = rand.nextInt(1, 100);
		Integer y = rand.nextInt(1, 100);
		
		Scanner s = new Scanner(System.in);
		System.out.printf("%d+%d=", x, y);
		Integer sum = s.nextInt();
		
		System.out.println(sum == x + y);
		
		s.close();
		
	}
}
