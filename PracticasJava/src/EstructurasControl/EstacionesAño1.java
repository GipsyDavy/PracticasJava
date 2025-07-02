package EstructurasControl;

import java.util.Scanner;

/*Implementa un programa en Java que dada una fecha, nos indique cuál es la estación del año. En el hemisferio que tú quieras, aunque la solución se dará del 
hemisferio norte. El día del mes, y el mes del año se deben introducir como números enteros a través del teclado*/


public class EstacionesAño1 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.print("Introduce un día del 1 al 31: ");
		int dia = sc.nextInt();
		
		System.out.print("Introduce un mes del 1 al 12: ");
		int mes = sc.nextInt();
		
		if (mes == 1 || mes == 2 || (mes == 3 && dia < 20) || (mes == 12 && dia > 20)) {
			System.out.println("Es invierno");
		} else if (mes == 7 || mes == 8 || (mes == 6 && dia > 20) || (mes == 9 && dia < 22)) {
			System.out.println("Es verano");
		} else if (mes == 10 || mes == 11 || (mes == 9 && dia > 21) || (mes == 12 &&  dia < 21)) {
			System.out.println("Es otoño");
		} else if (mes == 4 || mes == 5 || (mes == 3 && dia >19) || (mes == 6 && dia < 21)) {
			System.out.println("Es primavera");
		} 
		else {
			System.out.println("Fecha no válida");
		}
		sc.close();

	}

}
