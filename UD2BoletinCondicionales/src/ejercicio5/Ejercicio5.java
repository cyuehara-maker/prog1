/*
 * Determinar el precio de un billete de tren, conociendo la distancia a recorrer, y sabiendo que
 * si el número de días de estancia es superior a 7 y la distancia superior a 800 km el billete tiene una reducción del 30%.
 * El precio por kilómetro es de 2,5€.
 * La distancia a recorrer y el número de días de estancia los debes solicitar al usuario por teclado.
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	
	private final static Double PRECIO_KM = 2.5;
	private final static Integer MIN_DIAS_DESCUENTO = 7;
	private final static Integer MIN_KM_DESCUENTO = 800;
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("dias: ");
		Integer dias = s.nextInt();
		System.out.print("km: ");
		Integer km = s.nextInt();
		
		Double precio = (km * PRECIO_KM);
		if (dias >= MIN_DIAS_DESCUENTO && km >= MIN_KM_DESCUENTO) {
			precio *= .7;
		}
		
		System.out.println(precio);

		s.close();
		
	}
}
