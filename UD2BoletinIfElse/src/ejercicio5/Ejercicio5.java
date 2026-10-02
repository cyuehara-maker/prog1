package ejercicio5;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		Double a = 1.;
		Double b = 3.;
		Double c = 6.;
		
		Double root = b * b - 4 * a * c;
		
		if (root < 0) {
			System.out.println("no soluciones reales");
			System.exit(0);
		}
		
		root = Math.sqrt(root);
		Double x1 = (-b + root) / 2 * a;
		Double x2 = (-b - root) / 2 * a;
		
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
	}
}
