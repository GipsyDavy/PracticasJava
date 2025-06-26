package VariablesOperadores;

public class IntercambioValorVariables {

	public static void main(String[] args) {
		
		// Escribe un programa en Java que intercambie el valor de dos variables.
		
		int a = 17;
		int b = 30;
		int intercambio;
		
		intercambio = a; // Guardamos el valor de a en una variable temporal
		a = b; // Asignamos el valor de b a a
		b = intercambio; // Asignamos el valor guardado de a a b
		System.out.println("El valor de a es: " + a);
		System.out.println("El valor de b es: " + b);
		
		

	}

}
