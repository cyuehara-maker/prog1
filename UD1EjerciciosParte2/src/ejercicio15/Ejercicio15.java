package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("a: ");
		Integer a = s.nextInt();
		System.out.print("b: ");
		Integer b = s.nextInt();
		System.out.print("c: ");
		Integer c = s.nextInt();
		
		// diferentes resultados por prioridad de operaciones
		System.out.println("a + b * c = " + a + b * c);
		System.out.println("(a + b) * c = " + (a + b) * c);
		
		s.close();
		
	}

}
