package EstructurasControl;

import java.util.Scanner;

/*Calcula cuál es el resultado de sumar los `n` primeros números positivos. 
 * Introduce el valor de `n` a través del teclado.*/

public class SumaPositivos {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero entero positivo -> ");
		int num = sc.nextInt();
		
		int suma= 0;
		
		for (int i = 1; i <= num; i++) {
			suma += i; // Suma los números del 1 al n
		}
		
		System.out.println("La suma de los primeros " + num + " números positivos es: " + suma);
		
		sc.close();
	}

}
