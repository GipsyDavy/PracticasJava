package VariablesOperadores;

public class Practica4Bis {

	public static void main(String[] args) {
		/*Escribir un programa que calcule el perímetro y el área de un círculo y la muestre por consola. 
		 * El `radio` del mismo lo puedes proporcionar como un valor inicial de la variable correspondiente.
		 * area = pi * radio^2
		 * perímetro = 2 * pi * radio
		 */
		
		//Otra forma de hacerlo, sin usar Math.pow, sin hacer casting a int, y usando una variable para el resultado del área y otra para el perímetro.
		
		double radio = 5.5;
		double pi = Math.PI;
		
		double area = pi * (radio * radio); // o pi * Math.pow(radio, 2);
		double perimetro = 2 * pi * radio; // o 2 * pi * radio;
		
		System.out.println("El área del círculo es: " + area);
		System.out.println("El perímetro del círculo es: " + perimetro);

	}

}
