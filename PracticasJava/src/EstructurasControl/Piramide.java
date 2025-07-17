package EstructurasControl;

import java.util.Scanner;

// Escribe un programa en Java que pinte una pirámide con asteriscos. El número de pisos debe introducido a través del teclado.


public class Piramide {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.print("Introduce el número de pisos de la pirámide -> ");
		int pisos = sc.nextInt();
		
		if (pisos <= 0) {
		System.out.println("\nEl número introducido no puede ser cero o negativo");
		return;
		}
		
		for (int i = 1; i <= pisos ; i++) {// Recorremos los pisos
			for (int j = 1; j <= pisos - i; j++) {// Imprimimos los espacios
				System.out.print(" ");
			}
				
				for (int k = 1; k <= (2 * i - 1); k++) {// Imprimimos los asteriscos
					System.out.print("*");
			}
		
			System.out.println(); // Salto de línea al final de cada piso
			
		}
		 
		sc.close(); 
	}

}
