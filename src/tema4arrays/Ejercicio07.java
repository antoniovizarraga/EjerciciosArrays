package tema4arrays;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Creamos un array de Strings para almacenar los meses del año
		String[] calendario = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
		"Septiembre", "Octubre", "Noviembre", "Diciembre" };
		
		// Creamos un array de enteros para almacenar las temperaturas de cada mes
		int[] tabla = new int[12];

		// Variable para almacenar el valor introducido por el usuario
		String userValue = "";

		// Creamos un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Recorremos el array de meses
		for (int i = 0; i < calendario.length; i++) {

			// Pedimos al usuario que introduzca la temperatura de cada mes
			System.out.println(
			"¿Qué temperatura hizo en " + calendario[i] + "? " + "(" + i + "/" + calendario.length + ")");
			userValue = sc.nextLine();
			// Convertimos la entrada del usuario a un entero y lo almacenamos en el array de temperaturas
			tabla[i] = Integer.parseInt(userValue);
		}
		
		System.out.println();
		
		// Recorremos el array de temperaturas
		for(int i = 0; i < tabla.length; i++) {
			// Imprimimos el nombre del mes y un separador
			System.out.print(calendario[i] + " | ");
			// Imprimimos un número de asteriscos igual al valor que haya en la tabla
			for(int j = 0; j < tabla[i]; j++) {
				System.out.print("*");
			}
			// Pasamos a la siguiente línea
			System.out.println();
		}
		
		// Cerramos el Scanner
		sc.close();
	}

}