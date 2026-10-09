package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Character continuar = null;
		
		do {
			
			String play;
			
			// p1
			System.out.print("jugador 1: ");
			Player p1;
			do {
				play = s.next().toLowerCase();
				p1 = pick(play);
			} while (p1 == null);

			// p2
			System.out.print("jugador 2: ");
			Player p2;
			do {
				play = s.next().toLowerCase();
				p2 = pick(play);
			} while (p2 == null);
			
			// ganador
			if (p1 == p2) {
				System.out.println("empate");
			} else {
				
				Integer winner = null;
				switch (p1) {
				case PIEDRA:
					winner = p2 == Player.PAPEL ? 2 : 1;
					break;
				case PAPEL:
					winner = p2 == Player.TIJERAS ? 2 : 1;
					break;
				case TIJERAS:
					winner = p2 == Player.PIEDRA ? 2 : 1;
					break;
				default:
					break;
				}
				
				System.out.println("gana p" + winner);
			}
			
			// terminar/continuar
			System.out.print("S para continuar: ");
			continuar = s.next().toUpperCase().charAt(0);
			
		} while (continuar == 'S');
		
		s.close();
		
	}
	
	// pick jugada
	private static Player pick(String play) {
		
		Player p = null;
		switch (play) {
			case "piedra": p = Player.PIEDRA; break;
			case "papel": p = Player.PAPEL; break;
			case "tijeras": p = Player.TIJERAS; break;
			default: break;
		}
		
		return p;
	}	
}

enum Player {
	PIEDRA,
	PAPEL,
	TIJERAS
}
