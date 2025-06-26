package VariablesOperadores;

public class AreaPerimetroCirculo {

	public static void main(String[] args) {
		
		/*Escribir un programa que calcule el perímetro y el área de un círculo y la muestre por consola. 
		 * El `radio` del mismo lo puedes proporcionar como un valor inicial de la variable correspondiente.
		 * area = pi * radio^2
		 * perímetro = 2 * pi * radio
		 */
		
		double radio = 5.5;
		double pi = Math.PI;
		
		System.out.println("El área del círculo es: " + (int) (pi * Math.pow(radio, 2)));//se hace casting a int para que no muestre decimales
		System.out.println("El perímetro del círculo es: " + (int) (2 * pi * radio));//se hace casting a int para que no muestre decimales
		

	}

}
