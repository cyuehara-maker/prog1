package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Integer sum = 0;
		for (int i = 1; i <= 19; i += 2) {
			sum += i;
		}
		System.out.println(sum);
		
		s.close();
		
	}
}
