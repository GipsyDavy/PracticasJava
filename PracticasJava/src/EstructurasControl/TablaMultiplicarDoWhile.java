package EstructurasControl;

import java.util.Scanner;

public class TablaMultiplicarDoWhile {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.print("Introduce un número entero del 1 al 10 para ver su tabla de multiplicar -> ");
			num = sc.nextInt();			
			
		}
		while (num < 1 || num > 10);
		
		System.out.println();
		System.out.println("La tabla de multiplicar del número " + num + " es:");
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			
			int resultado = num * i;
			
			System.out.println(num + " * " + i + " = " + resultado);
		}
		
		sc.close();				

	}

}
