package parte2;

import java.util.Scanner;

public class E003 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("numero: ");
		Integer x = s.nextInt();
		System.out.print("multiplo: ");
		Integer y = s.nextInt();
		
		Integer resto = x != y ? y - (x % y) : 0;
		System.out.println(resto + " para ser a multiplo de " + y);
		
		s.close();
		
	}

}
