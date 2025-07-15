package EstructurasControl;

import java.util.Scanner;

/*Escribe un programa en Java que comprueba si un año es bisiesto o no. 
 * Recuerda que los años bisiestos son aquellos que son divisibles entre 4 pero 
 * que no son divisibles entre 100, o que son divisibles entre 400.
 */

public class AñoBisiesto {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.print("Introduzca un año -> ");
		int year = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)) {
			System.out.println("\nEl año introducido -> " + year + " es BISIESTO.");
		}
		
			else {
				System.out.println("\nEl año introducido -> " + year + " NO es BISIESTO.");
			}
		
		sc.close();	

	}

}
