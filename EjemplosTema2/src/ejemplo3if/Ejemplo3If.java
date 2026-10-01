package ejemplo3if;

public class Ejemplo3If {
	public static void main(String[] args) {
		
		Integer a = 2000;
		Integer mes = 7;
		
		Integer dias = getDays(mes, a);
		
		System.out.println("el mes " + mes + " del año " + a + " tiene " + dias + " días");
		
	}
	
	private static Integer getDays(Integer mes, Integer a) {

		Integer dias = 30;
		
		switch (mes) {
		case 1:
			dias++;
			break;
		case 2:
			dias = isBisiesto(a) ? 29 : 28;
			break;
		case 3:
			dias++;
			break;
		case 5:
			dias++;
			break;
		case 7:
			dias++;
			break;
		case 8:
			dias++;
			break;
		case 10:
			dias++;
			break;
		case 11:
			dias++;
			break;
		default:
			break;
		}
		
		return dias;
	}
	
	private static Boolean isBisiesto(Integer a) {
		return a % 400 == 0 || (a % 4 == 0 && a % 100 != 0);
	}
}
