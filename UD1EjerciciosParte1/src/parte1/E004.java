package parte1;

import java.util.Scanner;

public class E004 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("nota 1: ");
		Integer nota1 = s.nextInt();
		System.out.print("nota 2: ");
		Integer nota2 = s.nextInt();
		
		Double media = (double) (nota1 + nota2) / 2;
		
		System.out.println("media: " + media);
		
		s.close();

	}

}
