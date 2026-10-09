package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Integer positiveSum = 0;
		Integer zeroCount = 0;
		Integer negativeCount = 0;
		Double negativeAVG = 0.;
		
		for (int i = 0; i < 10; i++) {
			Integer input = s.nextInt();

			if (input > 0) {
				positiveSum += input;
			}
			if (input < 0) {
				negativeAVG += input;
				negativeCount++;
			}
			if (input == 0) {
				zeroCount++;
			}

		}
		
		System.out.println("suma de positivos: " + positiveSum);
		System.out.println("media de negativos: " + negativeAVG / negativeCount);
		System.out.println("ceros: " + zeroCount);
		
		s.close();
	}
}
