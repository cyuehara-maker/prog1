package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Integer input = s.nextInt();

		Double sum = 0.;
		Integer count = 0;
		while (input >= 0) {
			sum += input;
			count++;
			input = s.nextInt();
		}

		System.out.println("media: " + sum / count);

		s.close();
		
	}
}
