package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("base: ");
		Double base = s.nextDouble();
		System.out.print("altura: ");
		Double altura = s.nextDouble();
		
		Double perimetro = base * 2 + altura * 2;
		Double area = base * altura;
		
		System.out.println("perimetro: " + perimetro);
		System.out.println("area: " + area);
		
		s.close();
		
	}

}
