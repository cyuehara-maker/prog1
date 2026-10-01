package ejemplo2if;

public class Ejemplo2If {
	public static void main(String[] args) {
		
		Integer x = 5;
		Integer y = 7;
		Integer z = 8;
		Integer mayor = 0;
		
		if (mayor < x) {
			mayor = x;
		}
		if (mayor < y) {
			mayor = y;
		}
		if (mayor < z) {
			mayor = z;
		}
		
		System.out.println(mayor);
	}
}
