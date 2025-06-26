package VariablesOperadores;

import java.util.Scanner;

public class ConversorMoneda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca la cantida de euros que desea convertir a dolares americanos: ");
		double euros = sc.nextDouble();
		double dolares = 1.17;
		
		double resultado = euros * dolares;
		
		System.out.println(euros + " euros son " + resultado + " dolares");
		
		sc.close();

	}

}
