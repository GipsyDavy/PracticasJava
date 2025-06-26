package VariablesOperadores;

import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		/* Si las notas se quieren introducir con "." en vez de "," hay que cambiar la configuración del Scanner
		 * 
		 * var sc = new Scanner(system.in).useLocale(Locale.US);
		 */
		
		System.out.print("Introduzca la primera nota del alumno -> ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Introduzca la segunda nota del alumno -> ");
		double nota2 = sc.nextDouble();
		
		System.out.print("Introduzca la tercera nota del alumno -> ");
		double nota3 = sc.nextDouble();
		
		double notaMedia = (nota1 + nota2 + nota3) / 3;
		
		/* para redondear a entero, se puede hacer de dos formas:
		 * 
		 * 1. notaMedia = Math.round(notaMedia);
		 * 2. notaMedia = (int) notaMedia;
		 */
		
		
		notaMedia = (int) notaMedia;		
		System.out.println("La nota media del alumno es -> " + notaMedia);
		
		String tipoNota = (notaMedia >= 5) ? "El alumno ha APROBADO" : "El alumno ha SUSPENDIDO";
		System.out.println(tipoNota);
		
		sc.close();
		
		

	}

}
