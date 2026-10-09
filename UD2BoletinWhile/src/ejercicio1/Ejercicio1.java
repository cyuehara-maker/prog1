package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Integer input = s.nextInt();
		
		Integer sum = 0;
		while(input >= 0) {
			sum += input;
			input = s.nextInt();
		}
		
		System.out.println("La suma es " + sum);
		
		s.close();
		
	}
}
