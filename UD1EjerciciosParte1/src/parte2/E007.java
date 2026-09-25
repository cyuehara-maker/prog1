package parte2;

import java.util.Scanner;

public class E007 {
	
	final static Double INFANTIL = 15.5;
	final static Double ADULTO = 20.;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("numero de entradas infantiles: ");
		Integer infantil = s.nextInt();
		System.out.print("numero de entradas adulto: ");
		Integer adulto = s.nextInt();
		
		Double importeTotal = infantil * INFANTIL + adulto * ADULTO;
		if (importeTotal >= 100) importeTotal *= .95;
		
		System.out.println("importe: " + importeTotal);
		
		s.close();
		
	}

}
