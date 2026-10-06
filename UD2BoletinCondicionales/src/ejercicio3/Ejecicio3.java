/*
 * El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene a partir del número de la siguiente forma:
 * letra = número DNI módulo 23
 * Diseña una aplicación en la que, dado un número de DNI, calcule la letra que le corresponde.
 * Observa que un número de 8 dígitos está dentro del rango del tipo int.
 */
package ejercicio3;

import java.util.Scanner;

public class Ejecicio3 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("dni (sin letra): ");
		Integer num = s.nextInt();
		
		Character c = null;
		switch (num % 23) {
		case 0: c = 'T'; break;
		case 1: c = 'R'; break;
		case 2: c = 'W'; break;
		case 3: c = 'A'; break;
		case 4: c = 'G'; break;
		case 5: c = 'M'; break;
		case 6: c = 'Y'; break;
		case 7: c = 'F'; break;
		case 8: c = 'P'; break;
		case 9: c = 'D'; break;
		case 10: c = 'X'; break;
		case 11: c = 'B'; break;
		case 12: c = 'N'; break;
		case 13: c = 'J'; break;
		case 14: c = 'Z'; break;
		case 15: c = 'S'; break;
		case 16: c = 'Q'; break;
		case 17: c = 'V'; break;
		case 18: c = 'H'; break;
		case 19: c = 'L'; break;
		case 20: c = 'C'; break;
		case 21: c = 'K'; break;
		case 22: c = 'E'; break;
		default: break;
		}
		System.out.println(c);
		
		s.close();
		
	}
}
