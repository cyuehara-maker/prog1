package parte1;

import java.util.Scanner;

public class E011 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("pesetas: ");
		Integer pesetas = s.nextInt();

		Double euros = (double) pesetas / 166;
		System.out.println("euros: " + euros);

		s.close();
	}

}
