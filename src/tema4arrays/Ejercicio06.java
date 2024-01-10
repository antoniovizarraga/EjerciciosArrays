package tema4arrays;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio06 {

	/*
	 * Crearemos un programa que pida 8 números enteros y los almacene en un Array.
	 * Luego recorrerá el Array e imprimirá esos números y al lado indicará si dicho
	 * número es par o impar.
	 */
	public static void main(String[] args) {
		// Creamos la variable que será el valor que meta el usuario.
		int userValue = 0;

		// Creamos el array.
		int[] tabla = new int[8];

		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos el for que pedirá al usuario los valores y los meterá en el Array.
		for (int i = 0; i < tabla.length; i++) {
			try {
				System.out.println("Introduzca un valor: " + "(" + i + "/" + tabla.length + ")");
				userValue = sc.nextInt();
				tabla[i] = userValue;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.err.println("Error. Has introducido un valor que no es un número entero.");
				break;
			}

		}

		// Comprobamos si es par si el resto de la división entre 2 es cero. De lo
		// contrario, es impar.
		for (int i : tabla) {
			if (i % 2 == 0) {
				System.out.println(i + " es par");
			} else {
				System.out.println(i + " es impar");
			}

		}

		// Cerramos el Scanner.
		sc.close();
	}

}
