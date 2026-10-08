package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("A: ");
		Integer a = s.nextInt();
		System.out.print("B: ");
		Integer b = s.nextInt();
		
		Integer mayor = a > b ? a : b;
		Integer menor = a + b - mayor;
		
		for (int i = menor; i <= mayor; i++) {
			System.out.println(i);
		}
		
		s.close();
		
	}
}
