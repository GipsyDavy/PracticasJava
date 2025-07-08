package EstructurasControl;

import java.util.Scanner;

/*Escribe un programa en Java que acepte por teclado un número entero y nos diga la cantidad de dígitos que tiene. 
 * Pista: si dividimos un número entre 10 una vez, le quitamos un dígito.
 * 1234 / 10 = 123 (división entera)
 * 1 / 10 = 0 (división entera)*/

public class NumeroDigitos {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		
		
		System.out.print("Introduce un número entero -> ");
		int num = sc.nextInt();
		
		int cantidadDigitos = 0;
		
		while (num != 0) {			
			num /= 10;
			cantidadDigitos++;
						
		}
		
		if (cantidadDigitos == 0) {
			cantidadDigitos = 1; // Si el número es 0, tiene un dígito
		}
		
		System.out.println("EL número entero tiene " + cantidadDigitos + " dígitos");
		
		sc.close();

	}

}
