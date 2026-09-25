package parte2;

import java.util.Scanner;

public class E004 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("y = ax^2 + bx + c");
		System.out.print("a: ");
		Double a = s.nextDouble();
		System.out.print("b: ");
		Double b = s.nextDouble();
		System.out.print("c: ");
		Double c = s.nextDouble();
		System.out.print("x: ");
		Double x = s.nextDouble();
		
		Double y = a * x * x + b * x + c;
		System.out.println("y = " + y);
		
		s.close();

	}

}
