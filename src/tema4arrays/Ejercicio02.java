package tema4arrays;
import java.util.Scanner;

public class Ejercicio02 {

	/* Vamos a crear una clase que solicite al usuario 5 valores, y los
	 * almacene en una tabla (Array). Hay que usar un único bucle en el
	 * que solicitamos los 5 valores y luego usamos dicho bucle para
	 * almacenarlos en la tabla. Y en otro bucle distinto, mostrar
	 * en pantalla los mismos números que se han introducido por
	 * orden (foreach). */
	public static void main(String[] args) {
		// Creamos la variable para que el usuario escriba el valor.
		int userValue = 0;
		
		// Creamos el Array dónde estarán los valores.
		int[] tabla = new int[5];
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Creamos el for que en el mismo bucle, pedirá los valores y los meterá en el Array.
		/* Lo hacemos así para luego poder meter el valor en cada posición de la tabla. */
		for(int i = 0; i < tabla.length; i++) {
			System.out.println("Intrdozca un valor: ");
			userValue = sc.nextInt();
			
			tabla[i] = userValue;
		}
		
		System.out.println("Los números que se introdujeron por orden son: ");
		
		// Y luego en otro bucle distinto (Foreach), imprimimos los valores por orden.
		/* Se hace así para cumplir con el ejercicio. */
		for(int i:tabla) {
			System.out.println(i);
		}
		
		// Cerramos el Scanner.
		sc.close();
	}

}
