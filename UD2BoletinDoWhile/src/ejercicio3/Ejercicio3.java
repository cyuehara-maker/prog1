package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("n: ");
		Integer n = s.nextInt();
		
		Integer sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		s.close();
		
	}
}
