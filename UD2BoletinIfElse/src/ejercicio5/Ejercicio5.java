package ejercicio5;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		Double a = -23.;
		Double b = 3.;
		Double c = 56.;
		
		Double disc = (b * b) - 4 * a * c;
		
		if (disc < 0) {
			System.out.println("no soluciones reales");
			System.exit(0);
		}
		
		disc = Math.sqrt(disc);
		Double x1 = (-b + disc) / (2 * a);
		Double x2 = (-b - disc) / (2 * a);
		
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
	}
}
