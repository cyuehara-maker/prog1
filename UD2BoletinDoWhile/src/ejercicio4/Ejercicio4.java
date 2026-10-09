package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("n: ");
		Integer n = s.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			Integer ni = n * i;
			System.out.printf("%d x %d = %d\n", n, i, ni);
		}
		
		s.close();
		
	}
}
