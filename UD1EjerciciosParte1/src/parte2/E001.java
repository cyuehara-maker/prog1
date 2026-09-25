package parte2;

import java.util.Scanner;

public class E001 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("numero: ");
		double x = s.nextDouble();
		
		// no para negativos
		Integer decimal = (int) (x * 10) % 10;
		Integer redondeado = decimal >= 5 ? (int) x + 1 : (int) x;
		
		System.out.println("redondeado: " + redondeado);
		
		s.close();
		
	}

}
