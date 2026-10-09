package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("N: ");
		Integer n = s.nextInt();
		
		Boolean esPrimo = true;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				esPrimo = false;
			}
		}
		
		System.out.println(esPrimo);
		
		s.close();
		
	}
}
