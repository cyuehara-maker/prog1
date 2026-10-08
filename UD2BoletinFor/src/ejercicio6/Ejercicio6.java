package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Boolean haySuspenso = false;
		for (int i = 1; i <= 5; i++) {
			System.out.print("calificacion " + i + ": ");
			if (s.nextInt() < 5) {
				haySuspenso = true;
			}
		}
		
		System.out.println(haySuspenso);
		
		s.close();
	}
}
