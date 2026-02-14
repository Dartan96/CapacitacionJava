package helloworld.tareas.seccion4;

import java.util.Scanner;

public class OperadorTernarioOrdenado {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer número");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número");
        int num2 = scanner.nextInt();

//        System.out.println("Ingresa el tercer número");
//        int num3 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2 ;
        min = (num1 < num2) ? num1 : num2 ;
//        max = (max > num3) ? max : num3;
        System.out.println("Los numeros ordenados que ingresaste de mayor a menor son: " + max +  "," + min);
    }
}
