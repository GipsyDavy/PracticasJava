package EstructurasControl;

import java.util.Scanner;

/*Escribe un programa que acepte por teclado una cadena y muestre la cadena inversa*/


public class CadenaInversa {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.print("Interoduce una cadena de caracteres -> ");
		String cadena = sc.nextLine();
		
		String cadenaInversa = ""; // Variable para almacenar la cadena invertida
		
		for (int i = cadena.length() -1; i >= 0; i--) { /*Inicialización: int i = cadena.length() - 1 Comienza desde el último índice de la cadena.
														length() devuelve el número de caracteres, pero los índices empiezan en 0.
														Condición: i >= 0
														Continúa mientras el índice sea mayor o igual a 0 (primer carácter).
														Actualización: i--
														Decrementa el índice en cada iteración (va hacia atrás).*/
			
			cadenaInversa += cadena.charAt(i); // Añade el carácter en la posición i a la cadena inversa.
						
		}
		
		System.out.println();
		System.out.println("La cadena inversa es -> " + cadenaInversa); // Muestra la cadena invertida
		sc.close();

	}

}
