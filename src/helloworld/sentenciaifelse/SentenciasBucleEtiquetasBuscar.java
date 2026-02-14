package helloworld.sentenciaifelse;

public class SentenciasBucleEtiquetasBuscar {
	public static void main(String[] args) {

		/*
		 *	Buscar un carácter o una letra dentro de la variable frase
		 * 	Pero se puede repetir varias veces.
		 * 	Entonces la idea es un contador y saber cuantas veces esta repetido ese carácter
		 * 	además de encontrarlo y contabilizar cuantas veces encuentra
		 */

		String frase = "trigo tres tristes tigres tragan trigo en un trigal";
		String palabra = "trigo";
		//Con un for se puede recorrer este String
		int maxFrase = frase.length();
		int maxPalabra = palabra.length();

		int cantidad = 0;
		char letra = 'g';
		buscar:
		for (int i = 0; i < maxFrase; i++)/*Posición en la frase desde la que podría empezar la palabra "trigo" */ {
			int k = i;
			for (int j = 0; j < maxPalabra; j++) {
				if (frase.charAt(k++) != palabra.charAt(j)) {
					continue buscar;
				}
			}
			cantidad++;
		}
		System.out.println("Encontrado = " + cantidad + " veces el caracter '" + palabra + "' en la frase");

	}
}
