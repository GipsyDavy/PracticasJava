package EstructurasControl;

import java.util.Scanner;

//Escribe un programa en Java que encuentre cuál es el mayor de 3 números usando sentencias if-else.
public class MayordeTres {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.println("A continuación va a introducir usted 3 números enteros y se mostrará finalmente el mayor de ellos.");
		
		System.out.print("\nIntroduzca el primer número -> ");
		int num1 = sc.nextInt();		
		System.out.print("\nIntroduzca el segundo número -> ");
		int num2 = sc.nextInt();		
		System.out.print("\nIntroduzca el tercer número -> ");
		int num3 = sc.nextInt();
		
		int mayor;
		
		if (num1 >= num2 && num1 >= num3) {
			mayor = num1;
		} 
		else if (num2 >= num1 && num2 >= num3) {
				mayor = num2;
		}
		
		else {
			mayor = num3;
				}
		
		System.out.println("\nEl mayor de los 3 números es: " + mayor);
		 
		sc.close();
		}

	}


