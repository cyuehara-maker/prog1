package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	static final Double DESCUENTO = .15;
	static final Double IVA = .21;
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("precio inicial: ");
		Double precio = s.nextDouble();
		
		precio -= precio * DESCUENTO;
		precio += precio * IVA;
		precio = (double) Math.round(precio * 200) / 200;
		
		System.out.println("precio final: " + precio);
		
		s.close();
		
	}
	
}
