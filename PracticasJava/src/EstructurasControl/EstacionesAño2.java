package EstructurasControl;

import java.util.Scanner;


/*Implementa un programa en Java que dada una fecha, nos indique cuál es la estación del año. En el hemisferio que tú quieras, aunque la solución se dará del 
hemisferio norte. El día del mes, y el mes del año se deben introducir como números enteros a través del teclado*/


public class EstacionesAño2 {
	
	public static void main(String[] args) {
		
        var sc = new Scanner(System.in);
        
        System.out.print("Introduce un día del 1 al 31: ");
        int dia = sc.nextInt();
    
        System.out.print("Introduce un mes del 1 al 12: ");
        int mes = sc.nextInt();
        
        String estacion = "";
        
        // Primero validamos la fecha
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            System.out.println("Fecha no válida");
            sc.close();
            return;
        }
        
        // Determinamos la estación
        if ((mes == 12 && dia >= 21) || mes == 1 || mes == 2 || (mes == 3 && dia < 20)) {
            estacion = "Es invierno";
        } else if ((mes == 3 && dia >= 20) || mes == 4 || mes == 5 || (mes == 6 && dia < 21)) {
            estacion = "Es primavera";
        } else if ((mes == 6 && dia >= 21) || mes == 7 || mes == 8 || (mes == 9 && dia < 23)) {
            estacion = "Es verano";
        } else {
            estacion = "Es otoño";
        }
        
        sc.close();    
        System.out.println("La estación del año correspondiente es-> " + estacion);
    }
}
	
