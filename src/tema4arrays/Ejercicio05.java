package tema4arrays;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio05 {

	/*
	 * Vamos a crear un programa que dado 10 valores en un Array, imprima la suma de
	 * todos estos y luego diga cuál es el máximo y cuál es el mínimo.
	 */
	public static void main(String[] args) {
		// Creamos la variable del usuario.
		double userValue = 0;

		// Creamos las variables que serán el mínimo y máximo.
		double max = 0;
		double min = 0;

		// Creamos la variable que será la suma de todos los valores.
		double suma = 0;

		// Creamos el Array.
		double[] tabla = new double[10];

		// Creamos un booleano que luego en el código explico más en detalle para qué
		// sirve.
		boolean flag = true;

		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos el for que se encargará de pedir valores y meterlos en el Array.
		for (int i = 0; i < tabla.length; i++) {
			try {
				System.out.println("Introduzca un valor numérico: ");
				userValue = sc.nextDouble();
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.err.println("Error. No has introducido un número.");
				break;
			}

			// Una vez salga del try catch, ahora es cuando el booleano que creamos antes
			// entra en juego.

			/*
			 * Esto lo hacemos para que ya haya un valor de referencia en las variables de
			 * min y max nada más el usuario meta un valor. Ya que si inicializamos el
			 * mínimo y el máximo a 0, y se da el caso de que todos los valores que meta el
			 * usuario son positivos o negativos, siempre una de las dos variables (min o
			 * max) será 0. Para evitar eso, hacemos que sólo el primer valor correcto que
			 * meta el usuario será el que se meta aquí en las variables. Y para ello
			 * hacemos uso de un if que comprueba un booleano.
			 */
			if (flag) {
				max = userValue;
				min = userValue;
				flag = false;
			}
			// Luego desactivamos el booleano y ya no se ejecutará más ese código.

			// Asignamos el valor del usuario a su posición correspondiente.
			tabla[i] = userValue;

			// Si el valor del usuario supera el máximo, asígnalo al máximo.
			if (userValue > max)
				max = userValue;
			// Comprueba también si es menor que el mínimo, en cuyo caso asígnalo.
			if (userValue < min)
				min = userValue;
		}

		// Hacemos la suma de todos los valores del Array.
		for (double i : tabla) {
			suma += i;
		}

		// Imprimimos el resultado...
		System.out.println(
				"La suma total es de: " + suma + ", mientras que el mínimo es: " + min + " y el máximo es de: " + max);

		// Y cerramos el Scanner.
		sc.close();

	}

}
