package parte2;

import java.util.Scanner;

public class E006 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("mm: ");
		Double mm = s.nextDouble();
		System.out.print("cm: ");
		Double cm = s.nextDouble();
		System.out.print("m: ");
		Double m = s.nextDouble();
		
		Double totalCm = (double) (mm / 10) + cm + (m * 100);
		System.out.println("cm totales: " + totalCm);
		
		s.close();
		
	}

}
