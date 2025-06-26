package VariablesOperadores;

import java.util.Scanner;

public class PrecioFinalPortatil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el precio de fabricación del portátil -> ");
		double precioFabricacion = sc.nextDouble();
		final double IVA = 0.21;
		final double MARGEN_GANANCIA = 0.3;
		
		double precioSinIva = precioFabricacion + (precioFabricacion * MARGEN_GANANCIA);
		double precio = precioSinIva + (precioSinIva * IVA);
			
	
		/* Forma de simplificar la formula
		 * 
		 *  double precio = precioFabricacion * (1 + MARGEN_GANANCIA) * (1 + IVA);
		 */
		 		
		System.out.println("El precio total del portátil es -> " + precio);
		
		if (precio <= 600) {
		System.out.println("El presico del portátil es -> NORMAL" );
		}
		
		else {
			System.out.println("El precio del portátil es -> LUJO");
		}
		
		/*OTRA FORMA DE PONER EL CONDICIONAL, donde si se cumple que es menor o igual a 600, se imprime el primer mensaje, y si no, el segundo.
		 * 
		 * String tipoPrecio = (precio <= 600) ? "El presico del portátil es -> NORMAL" : "El precio del portátil es -> LUJO";
		 * System.out.println(tipoPrecio);
		 * */
		
		sc.close();
			

	}

}
