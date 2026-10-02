package ejercicio6;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		Integer x = 99998;

		Integer counter = 0;
		while (x > 0) {
			x /= 10;
			counter++;
		}
		
		System.out.println(counter);
	}
}
