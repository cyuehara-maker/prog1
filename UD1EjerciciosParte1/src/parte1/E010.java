package parte1;

import java.util.Scanner;

public class E010 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("numero: ");
		Integer x = s.nextInt();

		boolean esPar = x % 2 == 0;

		if (esPar) {
			System.out.printf("%d es par", x);
		} else {
			System.out.printf("%d es impar", x);
		}

		s.close();

	}

}
