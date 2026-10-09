package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		Integer altura = 0;
		Integer mayor = Integer.MIN_VALUE;
		do {
			altura = s.nextInt();
			if (mayor < altura) {
				mayor = altura;
			}
		} while (altura >= 0);
		
		System.out.println(mayor / 100. + " -> alturaMaxima");
		
		s.close();
		
	}
}
