package ejercicio2;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		Integer x = 4;
		Integer y = 7;
		Integer z = 3;
		Integer mayor = Integer.MIN_VALUE;
		
		if (x > mayor) {
			mayor = x;
		}
		if (y > mayor) {
			mayor = y;
		}
		if (z > mayor) {
			mayor = z;
		}
		
		System.out.println("mayor: " + mayor);
		
	}
}
