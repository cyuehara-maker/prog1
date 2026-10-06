/*
 * Pedir al usuario el número de un mes y el año (comprobando si es o no bisiesto).
 * Debe imprimir por pantalla el número de días que tiene el mes.
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("año: ");
		Integer anyo = s.nextInt();
		System.out.println("mes: ");
		Integer mes = s.nextInt();
		
		Integer dias = null;
		if (mes == 2) {
			Boolean esBisiesto = anyo % 400 == 0 || (anyo % 4 == 0 && anyo % 100 != 0);
			dias = esBisiesto ? 29 : 28;
		} else if (mes <= 7) {
			dias = mes % 2 != 0 ? 31 : 30;
		} else {
			dias = mes % 2 == 0 ? 31 : 30;
		}
		System.out.println(dias);
		
		s.close();
		
	}
}
