package EstructurasControl;

import java.util.Scanner;

/*Escribe un programa en Java que muestre la nota literal de un estudiante en función de su nota numérica usando `switch` como expresión, no como sentencia*/

public class NotaEstudiante {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.print("Introduce la nota numérica del estudiante -> ");
		int notaNumerica = sc.nextInt();
		
		String notaLiteral = switch (notaNumerica) {
			case 0, 1, 2, 3, 4 -> "Insuficiente";
			case 5 -> "Suficiente";
			case 6 -> "Bien";
			case 7, 8 -> "Notable";
			case 9, 10 -> "Sobresaliente";
			default -> "Nota no válida";
			
		};
		
		System.out.println("La nota obtenida es de " + notaLiteral);
		
		
		sc.close();
		
		

	}

}
