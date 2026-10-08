package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("n!: ");
		Integer n = s.nextInt();
		
		Integer factorial = 1;
		for (int i = 2; i <= n; i++) {
			factorial *= i;
		}
		
		System.out.println(factorial);
		
		s.close();
	}
}
