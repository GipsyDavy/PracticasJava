package Condicionales;

import java.util.Scanner;



public class EjemplosCondicionales {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);// Al declarar la variable como var, el compilador infiere el tipo de dato.
		
		// Ejemplo de condicionales con operador ternario.
		
		System.out.print("Interoduce un numero del 0 al 10 -> ");
		int numero = sc.nextInt();
		
		String mensaje = (numero < 0) ? "El núemro introducido es menor que 0, por favor introdzuca otro número" : 
			(numero > 10) ? "El número introducido es mayor que 10, por favor introduzca otro número" : 
				"Felicidades, ha introducido usted el número -> " + numero + " éste número se encuentra entre el 0 y el 10";
				
				System.out.println(mensaje);
				
			// Ejemplo de condicionales con if-else.
		
		System.out.print("Interoduce un numero del 0 al 10 -> ");
		int numero2 = sc.nextInt();
		
			if (numero2 < 0) {
			System.out.println("El núemro introducido es menor que 0, por favor introdzuca otro número");
		}
				else if (numero2 > 10) {
					System.out.println("El número introducido es mayor que 10, por favor introduzca otro número");
				}
				else {
					System.out.println("Felicidades, ha introducido usted el número -> " + numero2 + " éste número se encuentra entre el 0 y el 10");
				}
				
				
		
		sc.close();
		
		

	}

}
