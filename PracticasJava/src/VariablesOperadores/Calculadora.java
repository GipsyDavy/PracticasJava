package VariablesOperadores;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		/*Escribe un programa que lea dos números enteros por teclado, y realice las operaciones básicas de una calculadora con ellos: 
		 * suma, resta, multiplicación, división y resto. Debe mostrar todos los resultados por consola.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el primer número -> ");
		int num1 = sc.nextInt();
		System.out.print("Introduzca el segundo número -> ");
		int num2 = sc.nextInt();
		
		int suma = num1 + num2;
		int resta = num1 - num2;
		int multiplicacion = num1 * num2;
		System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
		System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
		System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicacion);
		
		// Para la división, comprobamos que el segundo número no sea cero para evitar la división por cero y después se realiza la operación.
		
		if (num2 != 0) {
			double division = (double) num1 / (double) num2;
			int resto = num1 % num2;
			System.out.println("La división de " + num1 + " entre " + num2 + " es: " + division);
			System.out.println("El resto de la división de " + num1 + " entre " + num2 + " es: " + resto);
		} else {
			System.out.println("No se puede realizar la división por cero.");
		}
		
		sc.close();
		

	}

}
