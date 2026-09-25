package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("litros: ");
		Double litros = s.nextDouble();
		System.out.print("capacidad de botella: ");
		Double capacidad = s.nextDouble();

		Integer cajasNecesarias = (int) Math.floor(litros / capacidad);
		System.out.println("botellas que se pueden llenar: " + cajasNecesarias);
		
		s.close();
		
	}

}
