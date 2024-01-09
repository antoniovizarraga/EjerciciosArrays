package tema4arrays;
import java.util.Scanner;

public class Ejercicio03 {

	/* Vamos a crear un programa que lea 10 números por teclado y
	 * que luego los muestre en orden inverso. */
	public static void main(String[] args) {
		
		// Variable que pediremos al usuario.
		int userValue = 0;
		
		// Array en el que meteremos los valores.
		int[] tabla = new int[10];
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Creamos un for para que introduzca los valores en el Array según lo vaya poniendo el usuario.
		for(int i = 0; i < tabla.length; i++) {
			System.out.println("Introduzca un valor.");
			userValue = sc.nextInt();
			
			tabla[i] = userValue;
		}
		
		
		System.out.println("El orden inverso sería:");
		
		// Y luego los imprimiremos en el orden inverso con este for.
		for(int i = tabla.length - 1; i >= 0; i--) {
			System.out.println(tabla[i]);
		}
		
		// Cerramos el Scanner.
		sc.close();
	}

}
