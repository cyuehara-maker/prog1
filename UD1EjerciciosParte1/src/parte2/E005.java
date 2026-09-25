package parte2;

import java.util.Scanner;

public class E005 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("segundos: ");
		Integer segundos = s.nextInt();
		
		Integer minutos = convertir(segundos);
		segundos -= minutos * 60;
		Integer horas = convertir(minutos);
		minutos -= horas * 60;
		
		System.out.printf("%dh %dm %ds%n", horas, minutos, segundos);
		
		s.close();
		
	}
	
	static Integer convertir(int tiempo) {
		Integer tiempoSig = tiempo / 60;
		tiempo = tiempo - tiempoSig * 60;
		return tiempoSig;
	}
	
}
