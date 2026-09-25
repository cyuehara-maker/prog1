package parte1;

import java.util.Scanner;

public class E007 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("nombre: ");
		String nombre = s.nextLine();
		System.out.print("direccion: ");
		String direccion = s.nextLine();
		System.out.print("telefono: ");
		Integer numero = s.nextInt();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Teléfono: " + numero);
		
		s.close();
		
	}

}
