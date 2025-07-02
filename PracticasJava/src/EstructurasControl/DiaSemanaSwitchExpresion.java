package EstructurasControl;

import java.util.Scanner;

/*
 * ● Realiza un programa en Java que, dado un día de la semana como un número entero, nos indique el día como texto. 
 * ● Haz dos versiones, una usando switch como expresión y otra como sentencia.*/

public class DiaSemanaSwitchExpresion {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		
		
		System.out.print("Introduce un número del 1 al 7 para el día de la semana: ");
		int dia = sc.nextInt();
		
		String diaSemana = switch (dia) {
		case 1 -> "Lunes";
		case 2 -> "Martes";
		case 3 -> "Miércoles";
		case 4 -> "Jueves";
		case 5 -> "Viernes";
		case 6 -> "Sábado";
		case 7 -> "Domingo";
		default -> "Número no válido. Debe ser del 1 al 7.";
		};
		
		System.out.println("El día de la semana es: " + diaSemana);
		sc.close();
	}

}
