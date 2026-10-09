package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Integer input = s.nextInt();
		
		Integer count = 0;
		while(input >= 0) {
			count++;
			input = s.nextInt();
		}
		
		System.out.println(count);
		
		s.close();
		
	}
}
