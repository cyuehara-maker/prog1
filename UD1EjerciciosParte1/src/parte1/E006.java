package parte1;

import java.util.Scanner;

public class E006 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("primer numero: ");
		Integer x = s.nextInt();
		System.out.print("segundo numero: ");
		Integer y = s.nextInt();
		
		System.out.printf("%d + %d = %d%n", x, y, x + y);
		System.out.printf("%d - %d = %d%n", x, y, x - y);
		System.out.printf("%d * %d = %d%n", x, y, x * y);
		System.out.printf("%d * %d = %d%n", x, y, x / y);
		
		s.close();

	}

}
