package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Character option = null;
		do {
			System.out.print("x: ");
			Double x = s.nextDouble();
			System.out.print("y: ");
			Double y = s.nextDouble();
	
			System.out.println("A. SUMAR LOS NUMEROS");
			System.out.println("B. RESTAR LOS NUMEROS");
			System.out.println("C. MULTIPLICAR LOS NUMEROS");
			System.out.println("D. DIVIDIR LOS NUMEROS");
			System.out.println("E. SALIR");
			System.out.print("opcion: ");
			option = s.next().toUpperCase().charAt(0);
	
			Double res = null;
			switch (option) {
			case 'A':
				res = x + y;
				break;
			case 'B':
				res = x - y;
				break;
			case 'C':
				res = x * y;
				break;
			case 'D':
				res = x / y;
				break;
			case 'E':
				System.out.println("bai");
				break;
			default:
				System.out.println("no es una opcion");
				break;
			}
	
			if (res != null) {
				System.out.println(res);				
			}
			
		} while (option != 'E');

		s.close();
	}
}
