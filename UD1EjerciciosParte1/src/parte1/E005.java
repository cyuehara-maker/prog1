package parte1;

import java.util.Scanner;

public class E005 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("radio: ");
		Double radio = s.nextDouble();
		
		Double longitud = 2 * Math.PI * radio;
		Double area = Math.PI * radio * radio;
		
		System.out.println("longitud: " + longitud);
		System.out.println("area: " + area);
		
		s.close();
		
	}

}
