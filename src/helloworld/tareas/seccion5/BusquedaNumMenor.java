package helloworld.tareas.seccion5;

import java.util.Scanner;

public class BusquedaNumMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir la cantidad de números a comparar (mínimo 10)
        System.out.print("Ingrese la cantidad de números a comparar (mínimo 10): ");
        int cantidad = sc.nextInt();

        // Validar que sea mínimo 10
        if (cantidad < 10) {
            System.out.println("Error: Debe ingresar mínimo 10 números.");
            sc.close();
            return;
        }

        // Variable para almacenar el número menor
        // Inicializamos con el primer número que se ingrese
        int numeroMenor = Integer.MAX_VALUE;

        // Bucle for para pedir los números
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = sc.nextInt();

            // Comparar y actualizar el número menor
            if (numero < numeroMenor) {
                numeroMenor = numero;
            }
        }

        // Imprimir el número menor
        System.out.println("\nEl número menor es: " + numeroMenor);

        // Comparar si es menor que 10
        if (numeroMenor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El numero menor es igual o mayor que 10!");
        }

        sc.close();
    }
}
/*
Solución del profesor
import java.util.Scanner;

public class ProgramaNumeroMenor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a comparar: ");
        int cantidad = scanner.nextInt();

        // preguntamos si es menor a 10, ya que el mínimo según la letra de la tarea es 10 (buscar el número menor de minimo 10 valores enteros).
        if (cantidad < 10) {
            System.out.println("Error: Debe comparar al menos 10 números enteros!");
        } else {
            int menor = Integer.MAX_VALUE; // asignamos un valor máximo por defecto como numero menor para comenzar
            int numero;

            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese el numero " + (i + 1) + ": ");
                numero = scanner.nextInt();
                menor = (numero < menor) ? numero : menor;
            }

            System.out.println("El número menor es: " + menor);

            if (menor < 10) {
                System.out.println("El número " + menor + " es menor que 10!");
            } else {
                System.out.println("El número " + menor + " es igual o mayor que 10!");
            }
        }
    }
}
 */
