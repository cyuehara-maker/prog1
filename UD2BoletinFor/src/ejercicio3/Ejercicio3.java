package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Double sum = 0.;
		for (int i = 1; i <= 10; i++) {
			System.out.print("n" + i + ": ");
			sum += s.nextInt();
		}
		System.out.println(sum / 10);
		
		s.close();
		
	}
}
