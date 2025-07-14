package EstructurasControl;

import java.util.Scanner;

public class CadenaInversaStringBuilder {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.print("Introduce una cadena de caracteres -> ");
		String cadena = sc.nextLine();
		
		String cadenaInvertida = new StringBuilder(cadena).reverse().toString(); // Utiliza StringBuilder para invertir la cadena.
		
		System.out.println();
		System.out.println("La cadena inversa es la siguiente -> " + cadenaInvertida); // Muestra la cadena invertida
		
		sc.close();

	}

}
