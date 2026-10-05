package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("dia en numero: ");
		Integer dia = s.nextInt();

		String diaNombre = null;
		
		switch (dia) {
		case 1: diaNombre = "Lunes"; break;
		case 2: diaNombre = "Martes"; break;
		case 3: diaNombre = "Miercoles"; break;
		case 4: diaNombre = "Jueves"; break;
		case 5: diaNombre = "Viernes"; break;
		case 6: diaNombre = "Sabado"; break;
		case 7: diaNombre = "Domingo"; break;
		default: diaNombre = "entre 1 y 7"; break;
		}
		
		System.out.println(diaNombre);

		s.close();

	}
}
