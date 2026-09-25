package parte1;

import java.util.Scanner;

public class E012 {

	final static Double IMPORTE_MANZANA_KG = 2.35;
	final static Double IMPORTE_PERA_KG = 1.95;
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("manzanas vendidas en kg: ");
		Double manzanaVenta = s.nextDouble();
		System.out.print("peras vendidas en kg: ");
		Double peraVenta = s.nextDouble();

		Double importeManzana = IMPORTE_MANZANA_KG * manzanaVenta;
		Double importePera = IMPORTE_PERA_KG * peraVenta;
		Double importeTotal = importeManzana + importePera;
		System.out.println("importe total: " + importeTotal);

		s.close();
		
	}

}
