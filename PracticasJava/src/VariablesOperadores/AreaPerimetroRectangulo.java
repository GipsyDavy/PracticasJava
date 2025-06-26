package VariablesOperadores;

import java.util.Scanner;

public class AreaPerimetroRectangulo {

	public static void main(String[] args) {
		/* 
		 * Escribir un programa que calcule el área y el perímetro de un rectángulo y la muestre por consola. La `altura` y la `anchura`
		 * del mismo la puedes proporcionar como valores iniciales de las variables correspondientes.
		 */
		
		var sc = new Scanner(System.in);
		
		System.out.print("Introduce la altura del rectángulo: ");
		double altura = sc.nextDouble();
		
		System.out.print("Introduce el ancho del rectángulo: ");
		double ancho = sc.nextDouble();
		
		
		double areaRectangulo = altura * ancho;
		double perimetroRectangulo = 2 * (altura + ancho);
		
		areaRectangulo = (int) areaRectangulo;
		perimetroRectangulo = Math.round(perimetroRectangulo);
		
		System.out.println("El área del rectángulo es: " + areaRectangulo);
		System.out.println("El perímetro del rectángulo es: " + perimetroRectangulo);
		
		

	}

}
