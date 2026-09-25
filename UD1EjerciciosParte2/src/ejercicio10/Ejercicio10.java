package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("mes: ");
		s.nextInt();
		System.out.print("año: ");
		Integer a = s.nextInt();
		
		Boolean bisiesto = a % 400 == 0 || (a % 4 == 0 && a % 100 != 0);
		System.out.println(bisiesto);
		
		s.close();
		
	}
	
}
