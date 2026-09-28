package ejercicio14;

public class Ejercicio14 {
	
	private static Integer hp = 100;
	private static Integer vidas = 3;
	
	public static void main(String[] args) {
		
		hp += 50;
		hp -= 20;
		vidas++;
		vidas--;
		
		System.out.println("puntos de vida: " + hp);
		System.out.println("vidas: " + vidas);

	}
	
}
