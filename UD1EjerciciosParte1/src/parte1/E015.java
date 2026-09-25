package parte1;

import java.util.Scanner;

public class E015 {
	
	final static Integer IVA = 21;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("precio: ");
		Double precio = s.nextDouble();
		
		Double precioFinal = precio + (precio * IVA) / 100;
		System.out.println("precio final: " + precioFinal);

		s.close();
		
	}

}
