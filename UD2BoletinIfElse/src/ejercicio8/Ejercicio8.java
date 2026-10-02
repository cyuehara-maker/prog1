package ejercicio8;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		Integer x = 2;
		Integer y = 7;
		Integer z = 5;
		
		if (x == y + z) {
			System.out.printf("%d + %d = %d\n", y, z, x);
		} else if (y == x + z) {
			System.out.printf("%d + %d = %d\n", x, z, y);
		} else if (z == x + y) {
			System.out.printf("%d + %d = %d\n", x, y, z);
		} else {
			System.out.println("no suman");
		}
	}
}
