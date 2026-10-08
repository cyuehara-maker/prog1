package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("n: ");
		Integer n = s.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		
		s.close();
		
	}
}
