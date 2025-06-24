package openwebinars;

import java.util.Scanner;

public class PicandoCodigo {
	
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.print("Interoduce un numero del 0 al 10 -> ");
		int numero = sc.nextInt();
		
		String mensaje = (numero < 0) ? "El núemro introducido es menor que 0, por favor introdzuca otro número" : 
			(numero > 10) ? "El número introducido es mayor que 10, por favor introduzca otro número" :
				
				"Felicidades, ha introducido usted el número -> " + numero + " éste número se encuentra entre el 0 y el 10";
				
				System.out.println(mensaje);
				
				
		
		
		
		sc.close();
		
		
		
		}
	
}
