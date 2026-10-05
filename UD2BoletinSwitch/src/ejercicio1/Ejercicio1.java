package ejercicio1;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		int nota = 7;
		
		String salida = null;
		if (nota <= 4) {
			salida = "insuficiente";
		} else if (nota == 5) {
			salida = "suficiente";
		} else if (nota == 6) {
			salida = "bien";
		} else if (nota <= 8) {
			salida = "notable";
		} else {
			salida = "sobresaliente";
		}
		
		System.out.println(salida);
	}
}
