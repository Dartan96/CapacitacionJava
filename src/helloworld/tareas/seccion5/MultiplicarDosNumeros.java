package helloworld.tareas.seccion5;

import java.util.Scanner;

public class MultiplicarDosNumeros {
	public static void main(String[] args) {

		/*
		 *	Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).
		 *	Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor ingresa el primer número a multiplicar ");
		int a = sc.nextInt();
		System.out.println("Por favor ingresa el segundo número a multiplicar");
		int b = sc.nextInt();

		// Multiplicar sin usar *: sumar 'a' (en valor absoluto) tantas veces como 'b'
		int absA = a < 0 ? -a : a;
		int absB = b < 0 ? -b : b;

		int resultado = 0;
		for (int i = 0; i < absB; i++) {
			resultado += absA;
		}

		// Regla de signos: menos por menos = más; más por menos = menos
		if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
			resultado = -resultado;
		}

		System.out.println("El resultado de la multiplicación es: " + resultado);

//		int resultado = a * b;
//		System.out.println("El resultado de la multiplicación es: " + resultado);

		/*
		*	Solución del profesor
		* import java.util.Scanner;

public class MultiplicarSinSimbolo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a: ");
        int a = scanner.nextInt();

        System.out.println("Ingrese el numero b: ");
        int b = scanner.nextInt();
        int resultado = 0;

        // verificamos los signos de cada uno, si es positivo o negativo
        boolean positivoB = b > -1;
        boolean positivoA = a > -1;

        // calculamos el valor absoluto de a
        int absolutoA = positivoA? a: -a; // equivalente a Math.abs(a);

        // sumamos tantas veces el valor de b, segun el valor de a.
        for(int i = 0; i < absolutoA; i++){
            resultado = resultado + b;
        }

        // si ambos son negativos o si solo a es negativo damos vuelta el signo
        if((!positivoA && !positivoB) || !positivoA){
            resultado = -resultado;
        }

        System.out.println("el resultado es " + resultado);
    }
}
		 */
	}
}
