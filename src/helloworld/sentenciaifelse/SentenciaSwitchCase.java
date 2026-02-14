package helloworld.sentenciaifelse;

import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        int num = 2;
        String nombre = "Rogelio";
        switch (num){
            case 0:
                System.out.println("El num es 0");
                break;
            case 1:
                System.out.println("El num es 1 ");
                break;
            case 2:
                System.out.println("El num es 2");
                break;
            default:
                System.out.println("El numero es imaginario ");

        }
        switch (nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido");
                break;
            case "Ramon":
                System.out.println("Que tranza pandilla!!! ");
                break;
            case "Rogelio":
                System.out.println("Hola y adios.");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingresa el mes del rango 1-12. ");
        int mes = scanner.nextInt();
        switch (mes){
            case 1:
                System.out.println("El mes es Enero");
                break;
            case 2:
                System.out.println("El mes es febrero");
                break;
            case 3:
                System.out.println("El mes es marzo");
                break;
            case 4:
                System.out.println("El mes es abril");
                break;
            case 5:
                System.out.println("El mes es mayo");
                break;
            case 6:
                System.out.println("El mes es junio");
                break;
            case 7:
                System.out.println("El mes es julio");
                break;
            case 8:
                System.out.println("El mes es agosto");
                break;
            case 9:
                System.out.println("El mes es septiembre");
                break;
            case 10:
                System.out.println("El mes es octubre");
                break;
            case 11:
                System.out.println("El mes es noviembre");
                break;
            case 12:
                System.out.println("El mes es diciembre");
                break;
            default:
                System.out.println("Eso esta en tu imaginación");
                break;
        }
        System.out.println("El mes = " + mes);    }
}
