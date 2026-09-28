package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("dinero: ");
		Double dinero = s.nextDouble();
		
		Integer euros = (int) Math.floor(dinero);
		Integer centimos = (int) Math.round((dinero - euros) * 100);
		
		System.out.println("euros: " + euros);
		System.out.println("centimos: " + centimos);
		
		s.close();
		
	}
	
}
