package parte1;

import java.util.Scanner;

public class E013 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("¿esta lloviendo?: ");
		Boolean lluvia = s.nextBoolean();
		System.out.print("¿tareas finalizadas?: ");
		Boolean tarea = s.nextBoolean();
		System.out.print("¿biblioteca?: ");
		Boolean biblioteca = s.nextBoolean();
		
		Boolean permiso = biblioteca || (!lluvia && tarea);
		
		System.out.println("permiso: " + permiso);

		s.close();
		
	}

}
