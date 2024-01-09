package tema4arrays;

public class Ejercicio04 {

	/* Vamos a ver qué es lo que sucede cuando en un Array metemos en
	 * ciertas posiciones exactas un valor, pero en las demás no
	 * metemos nada. */
	public static void main(String[] args) {
		// Creamos el Array de 12 valores de longitud.
		int[] num = new int[12];
		
		// Inicializamos los valores de ciertas posiciones en concreto para luego ver qué pasa.
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		// Hacemos un foreach para ver qué pasa en cada caso...
		for(int i:num) {
			System.out.println(i);
		}
		
		/* ¡Y lo que sucede es que con las posiciones que no inicializamos,
		 * ya tienen un 0 como valor base! 🤔*/
	}

}
