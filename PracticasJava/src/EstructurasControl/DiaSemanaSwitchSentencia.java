package EstructurasControl;

import java.util.Scanner;

/* * ● Realiza un programa en Java que, dado un día de la semana como un número entero, nos indique el día como texto. 
 * ● Haz dos versiones, una usando switch como expresión y otra como sentencia.*/

public class DiaSemanaSwitchSentencia {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.print("Introduce un número del 1 al 7 para el día de la semana: ");
		int dia = sc.nextInt();
		
		String diaSemana = "";
		
		switch (dia) {
			case 1:
				diaSemana = "Lunes";
				break;
			case 2:
				diaSemana = "Martes";
				break;
			case 3:
				diaSemana = "Miércoiles";
				break;
			case 4:
				diaSemana = "Jueves";
				break;
			case 5:
				diaSemana = "Viernes";
				break;
			case 6:
				diaSemana = "Sábado";
				break;
			case 7:
				diaSemana = "Domingo";
				break;
			default:
				diaSemana = "Núemro no válido. Debe ser del 1 al 7.";
				break;		
			
		}
		System.out.println("El día de la semana es: " + diaSemana);
		sc.close();		

	}

}
