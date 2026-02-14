package helloworld.tareas.seccion4;

import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        int cantidad = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame la cantidad del tanque. ");
        cantidad = scanner.nextInt();

        if (cantidad >= 70){
            System.out.println("Estanque lleno");
        } else if (cantidad >=60 && cantidad <=70) {
            System.out.println("Estanque casi lleno");

        } else if (cantidad >= 40 && cantidad <= 60) {
            System.out.println("Estanque 3/4");

        } else if (cantidad >=35 && cantidad <= 40) {
            System.out.println("Medio Estanque");

        } else if (cantidad >=20 && cantidad <=35) {
            System.out.println("Suficiente");

        }else if (cantidad >=1 && cantidad <= 20){
            System.out.println("Insuficiente");
        }
    }
}
