package tema4arrays;
import java.util.Random;

/* Vamos a crear una clase que cree una tabla de longitud 10 que tendrá
 * números aleatorios del 1 al 100. */
public class Ejercicio01 {

	public static void main(String[] args) {
		// Creamos un array para almacenar los valores.
		int tabla[] = new int[10];
		
		// Creamos la variable con la clase Random para poder generar números.
		Random rnd = new Random();
		
		// Creamos la variable auxiliar para saber luego qué valor aleatorio ha generado el programa.
		int aux = 0;
		
		// Hacemos el for que hace lo siguiente:
		/* Generamos en la variable auxiliar un valor aleatorio del 1 al 100.
		 * 
		 * En cada posición de la tabla almacenaremos el valor generado
		 * anteriormente.
		 * 
		 * Imprimiremos en cada línea la posición actual y el valor generado.
		 * 
		 *  */
		for(int i = 0; i < tabla.length; i++) {
			aux = rnd.nextInt(1, 101);
			tabla[i] = aux;
			System.out.println("Posición " + i + " valor " + aux);
		}
		

	}

}
