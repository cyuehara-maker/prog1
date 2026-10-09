package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String mayorOMenor = "";
		Integer max = 100;
		Integer min = 1;
		Integer intento = (max + min) / 2;		
		
		do {
			
			Integer diferenciaMedia = (max - min) / 2;			
			System.out.println(intento);
			
			System.out.print("n es menor o mayor: ");
			mayorOMenor = s.nextLine().toLowerCase();
			
			if (mayorOMenor.equals("menor")) {
				intento -= diferenciaMedia;
				max = min + diferenciaMedia;
			}
			if (mayorOMenor.equals("mayor")) {
				intento += diferenciaMedia;
				min = max - diferenciaMedia;
			}
			
		} while (!mayorOMenor.equals("iguales"));
		
		s.close();
		
	}
}
