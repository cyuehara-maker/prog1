package ejercicio7;

public class Ejercicio7 {
	public static void main(String[] args) {

		Play p1 = Play.PAPEL;
		Play p2 = Play.PIEDRA;

		if (p1 == p2) {
			System.out.println("empate");
			System.exit(0);
		}

		Integer winner = null;
		switch (p1) {
			case Play.PIEDRA:
				winner = p2 == Play.PAPEL ? 2 : 1;
				break;
				
			case Play.PAPEL:
				winner = p2 == Play.TIJERA ? 2 : 1;
				break;

			case Play.TIJERA:
				winner = p2 == Play.PIEDRA ? 2 : 1;
				break;
			
			default:
				break;
		}
		
		System.out.println("gana jugador " + winner);

	}
}

enum Play {
	PIEDRA, PAPEL, TIJERA
}