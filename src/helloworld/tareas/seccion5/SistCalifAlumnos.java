package helloworld.tareas.seccion5;

import java.util.Scanner;


public class SistCalifAlumnos {
    public static void main(String[] args) {

        /*
         *Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
         *Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1,
         *además mostrar el promedio total.
         *Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas
         *una a una para realizar los cálculos (contadores, sumas).
         *Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y
         *mostrar un mensaje de error finalizando el programa.
         */

        Scanner sc = new Scanner(System.in);

        // Variables para los cálculos
        double sumaTotal = 0;
        double sumaMayores5 = 0;
        int contadorMayores5 = 0;
        double sumaMenores4 = 0;
        int contadorMenores4 = 0;
        int cantidadNotas1 = 0;
        boolean error = false;

        System.out.println("Ingrese 20 notas finales (escala 1 a 7):");

        // Bucle para pedir las 20 notas
        for (int i = 0; i < 20; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            double nota = sc.nextDouble();

            // Validación opcional: si la nota es 0, salir del ciclo
            if (nota == 0) {
                error = true;
                break;
            }

            // Suma total para el promedio general
            sumaTotal += nota;

            // Calcular promedio de notas mayores a 5
            if (nota > 5) {
                sumaMayores5 += nota;
                contadorMayores5++;
            }

            // Calcular promedio de notas inferiores a 4
            if (nota < 4) {
                sumaMenores4 += nota;
                contadorMenores4++;
            }

            // Contar notas iguales a 1
            if (nota == 1) {
                cantidadNotas1++;
            }
        }

        // Si hubo error (nota 0), mostrar mensaje y terminar
        if (error) {
            System.out.println("\n¡ERROR! Se ingresó una nota con valor 0. El programa ha finalizado.");
            sc.close();
            return;
        }

        // Calcular y mostrar los resultados
        System.out.println("\n=== RESULTADOS ===");

        // Promedio total
        double promedioTotal = sumaTotal / 20;
        System.out.println("Promedio total: " + String.format("%.2f", promedioTotal));

        // Promedio de notas mayores a 5
        if (contadorMayores5 > 0) {
            double promedioMayores5 = sumaMayores5 / contadorMayores5;
            System.out.println("Promedio de notas mayores a 5: " + String.format("%.2f", promedioMayores5) +
                    " (cantidad: " + contadorMayores5 + ")");
        } else {
            System.out.println("Promedio de notas mayores a 5: No hay notas mayores a 5");
        }

        // Promedio de notas inferiores a 4
        if (contadorMenores4 > 0) {
            double promedioMenores4 = sumaMenores4 / contadorMenores4;
            System.out.println("Promedio de notas inferiores a 4: " + String.format("%.2f", promedioMenores4) +
                    " (cantidad: " + contadorMenores4 + ")");
        } else {
            System.out.println("Promedio de notas inferiores a 4: No hay notas inferiores a 4");
        }

        // Cantidad de notas 1
        System.out.println("Cantidad de notas 1: " + cantidadNotas1);

        sc.close();


    }
}
/*
*Versión de la respuesta del maestro
* import java.util.Scanner;

public class PromedioNotasAlumnos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota; // la nota a ingresar
        int contNotas1 = 0; // el contador de notas 1
        int contNotasMayoresA5 = 0; // contador de notas mayores a 5
        int contNotasMenoresA4 = 0; // contador de notas menores a 4
        double sumaNotasMayoresA5 = 0; // suma de notas mayores a 5
        double sumaNotasMenoresA4 = 0; // suma de notas menores a 4
        double sumaTotal = 0; // suma total de notas

        double promedioNotasMayoresA5, promedioNotasMenoresA4; // los promedios de notas mayores a 5 y menores a 4

        boolean error = false;

        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce una nota (entre 1 y 7) N" + (i + 1) + ": ");
            nota = scanner.nextDouble();

            if (nota == 0) {
                error = true;
                break;
            }

            if (nota == 1) {
                contNotas1++;
            } else {
                if (nota > 5) {
                    contNotasMayoresA5++;
                    sumaNotasMayoresA5 += nota;
                } else if (nota < 4) {
                    contNotasMenoresA4++;
                    sumaNotasMenoresA4 += nota;
                }
            }
            sumaTotal += nota;
        }
        if (error) {
            System.err.println("Error: No pueden haber notas con valor 0, ha finalizado la ejecución del programa.");
            System.exit(1);
        }
        // mostramos la cantidad de notas 1
        System.out.println("El número de notas 1 es de: " + contNotas1);
        //trabajamos con las notas superiores a 5
        if (contNotasMayoresA5 == 0) {
            System.out.println("No se puede calcular el promedio de notas sobre 5");
        } else {
            promedioNotasMayoresA5 = sumaNotasMayoresA5 / contNotasMayoresA5;
            System.out.println("Promedio de notas mayores a 5: " + promedioNotasMayoresA5);
        }

        // trabajamos con las notas inferiores a 4
        if (contNotasMenoresA4 == 0) {
            System.out.println("No se puede calcular el promedio de notas bajo 4");
        } else {
            promedioNotasMenoresA4 = sumaNotasMenoresA4 / contNotasMenoresA4;
            System.out.println("Promedio de notas menores a 3: " + promedioNotasMenoresA4);
        }

        // promedio total de las notas
        double promedioTotalNotas = sumaTotal / 20;
        System.out.println("Promedio total de notas: " + promedioTotalNotas);
    }
}
 */
