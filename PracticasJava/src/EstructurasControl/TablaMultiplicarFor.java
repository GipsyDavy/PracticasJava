package EstructurasControl;

import java.util.Scanner;

/*Escribe un programa en Java que acepte por teclado un número entero entre 1 y 10 y muestre su tabla de multiplicar.*/


public class TablaMultiplicarFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero del 1 al 10 -> ");
		int num = sc.nextInt();
				
		System.out.println();
		
		if (num < 1 || num > 10) {
			System.out.println("Número introducido no válido");
		}
		else {
			
		System.out.println();
		System.out.println("La tabla de multiplicar del " + num + " es:");
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println();
		
			for (int i = 1; i <= 10; i++) {				
							
				int resultado = i * num;
				System.out.println(resultado);
			}
		}
		
		sc.close();
		}
		

	}


