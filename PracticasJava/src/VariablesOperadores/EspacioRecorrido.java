package VariablesOperadores;

import java.util.Scanner;

public class EspacioRecorrido {

	public static void main(String[] args) {
		
		/* Escribe un programa en Java que calcule cuál es el espacio recorrido por un objeto, como por ejemplo, una sonda espacial, que se mueve a velocidad constante. 
		 * Podemos suponer que el objeto ha recorrido un espacio inicial de 150.000 km y se mueve a una velocidad 17 km por segundo.
		 */
		Scanner sc = new Scanner(System.in);
		final int RECORRIDOINICIAL = 150000; // Espacio inicial en km
		final int VELOCIDAD = 17; // Velocidad en km/s
		
		
		
		System.out.print("Introduzca el tiempo en segundos: ");
		int segundos = sc.nextInt();
		int espacioRecorrido = RECORRIDOINICIAL + (VELOCIDAD * segundos); // Espacio recorrido en km
		System.out.println("El espacio recorrido en " + segundos + " segundos es: " + espacioRecorrido + " km");
		
		sc.close();
		
		
		

	}

}
