package parte2;

import java.util.Scanner;

public class E009 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("id de problema: ");
		Integer id = s.nextInt();
		
		Integer vol = id / 100;
		System.out.println("volumen: " + vol);
		
		s.close();
	}

}
