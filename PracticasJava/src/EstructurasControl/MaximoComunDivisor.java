package EstructurasControl;

import java.util.Scanner;

/*Escribe un programa en Java que acepte por teclado dos números enteros y calcule su máximo común divisor usando el algoritmo de Euclides.
 * Dicho algoritmo tiene los siguientes pasos:
 * a) Se divide el número mayor (`a`) entre el menor (`b`).
 * b) Si la división es exacta (resto igual a 0), el divisor es el m.c.d.
 * c) Si la división no es exacta, dividimos el divisor entre el resto obtenido y continuamos de esta forma hasta obtener una división exacta. El m.c.d. es el último divisor.
 */


public class MaximoComunDivisor {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Introduce dos número enteros para calcular el máximo común divisor: ");
		System.out.println();
		System.out.print("Introduce el primer número -> ");
		num1 = sc.nextInt();		
		System.out.print("Introduce el segundo número -> ");
		num2 = sc.nextInt();
		
		int a = num1;
		int b = num2;
		
		while (b !=0) {
			int resto = a % b; // Paso 1: Calculamos el resto
			a = b; // Paso 2: Actualizamos a con el valor de b
			b = resto; // Paso 3: Actualizamos b con el resto
		}
		System.out.println();
		System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es-> " + a);
				
					
		sc.close();
		

	}

}
