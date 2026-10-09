package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Integer sum = 0;

		for (int i = 0; i < 2; i++) {

			String tirada = null;
			Boolean esTiradaValida;
			do {

				esTiradaValida = true;
				System.out.print("cuanto has sacado: ");
				tirada = s.nextLine().toLowerCase();

				switch (tirada) {
				case "uno":
					sum += 1;
					break;
				case "dos":
					sum += 2;
					break;
				case "tres":
					sum += 3;
					break;
				case "cuatro":
					sum += 4;
					break;
				case "cinco":
					sum += 5;
					break;
				case "seis":
					sum += 6;
					break;
				default:
					esTiradaValida = false;
					break;
				}
				
			} while (!esTiradaValida);
		}

		System.out.println(sum);

		s.close();
	}
}
