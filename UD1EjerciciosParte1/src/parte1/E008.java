package parte1;

import java.util.Scanner;

public class E008 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("nombre: ");
		String nombre = s.nextLine();
		System.out.print("edad: ");
		Integer edad = s.nextInt();
		
		System.out.printf("Hola %s, tienes %d años, ¡qué mayor eres!", nombre, edad);
		
		s.close();
		
	}

}
