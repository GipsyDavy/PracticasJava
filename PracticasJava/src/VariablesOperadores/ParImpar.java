package VariablesOperadores;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		//Escribe un programa que determine si un número es par o impar usando el operador ternario.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número entero: ");
		int numero = sc.nextInt();
			
		
		
		String resultado = (numero % 2 == 0) ? "El numero es par" : "El numero es impar";		
		System.out.println("Para el número " + numero + " -> " + resultado);
		
		
		/*if (numero % 2 == 0) {
		System.out.println("El número es par.");
		} else {
		System.out.println("El número es impar.");
		}*/

		sc.close();
	}

}
