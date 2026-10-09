package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Integer input = s.nextInt();

		Integer ageSum = 0;
		Integer count = 0;
		Integer over18Count = 0;
		while (input >= 0) {
			
			ageSum += input;
			count++;
			
			if (input >= 18) {
				over18Count++;
			}

			input = s.nextInt();
		
		}
		
		System.out.println("suma: " + ageSum);
		System.out.println("media: " + (double) ageSum / count);
		System.out.println("mayores de edad: " + over18Count);
		
		s.close();
	}
}
