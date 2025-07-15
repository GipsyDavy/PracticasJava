package EstructurasControl;

import java.util.Scanner;

//Escribe un programa en Java que compruebe si un carácter es una vocal o no.

public class VocalSiNo {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.print("Introduce un caracter -> ");
			char caracter = sc.next().charAt(0);			
			// Convertimos a minúscula para simplificar la comparación pero al imprimirlo lo mostramos en el formato original
			char lowerChar = Character.toLowerCase(caracter); 			
			
			if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {			
				// al introducir \n, se imprime en una nueva línea no es necesario System.out.println()
				System.out.println("\nHa escrito usted la vocal " + caracter); 
			}				
				else {
					System.out.println("\nEl caracter introducido no es una vocal");
				}
			
			sc.close();
			}

	}


