package parte1;

import java.util.Scanner;

public class E014 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("primer trimestre: ");
		Integer primer = s.nextInt();
		System.out.print("segundo trimestre: ");
		Integer segundo = s.nextInt();
		System.out.print("tercer trimestre: ");
		Integer tercero = s.nextInt();

		double media = (double) (primer + segundo + tercero) / 3;
		System.out.println("boletin de calificaciones: " + (int) (media));
		System.out.println("expediente academico: " + media);
		
		s.close();
		
	}

}
