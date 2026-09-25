package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("numero de productos: ");
		Integer cantidad = s.nextInt();
		System.out.print("capacidad de caja: ");
		Integer capacidad = s.nextInt();

		Integer cajasNecesarias = (int) Math.ceil((double) cantidad / capacidad);
		System.out.println("cajas necesarias: " + cajasNecesarias);
		
		s.close();
		
	}

}
