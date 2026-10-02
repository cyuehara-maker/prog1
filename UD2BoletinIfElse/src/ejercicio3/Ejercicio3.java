package ejercicio3;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Integer mes = 2;
		Integer anyo = 2024;
		Integer dias = null;
		
		Boolean esBisiesto = anyo % 400 == 0 || (anyo % 4 == 0 && anyo % 100 != 0);
		
		if (mes == 2) {
			dias = esBisiesto ? 29 : 28;
		} else if (mes <= 7) {
			dias = mes % 2 == 0 ? 30 : 31;
		} else {
			dias = mes % 2 != 0 ? 30 : 31;
		}
		
		System.out.println("dias en el mes: " + dias);
		
	}
}
