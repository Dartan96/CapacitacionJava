package helloworld;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String variable = 8 == 7 ? "Si es verdadero" : "Si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Igrese la nota de matemáticas entre 2.0 - 7.0");
        matematicas = scanner.nextDouble();
        System.out.println("Igrese la nota de ciencias entre 2.0 - 7.0");
        ciencias = scanner.nextDouble();
        System.out.println("Igrese la nota de historia entre 2.0 - 7.0");
        historia = scanner.nextDouble();

        promedio = (matematicas + ciencias + historia)/3;

        estado = promedio >= 5.49 ? "Aprobado. " : "Rechazado";
        System.out.println("promedio = " + promedio);
        System.out.println("promedio = " + estado);

//        if (promedio >= 5.49){
//            estado = "Aprobado";
//        }else {
//            estado = "Reprobado";
//        }
    }
    /*Es un tipo de Operador que esta dividido por tres partes
    El primero evalua una expresión booleana, si se cumple
    va a devolver un valor o si no se cumple regresa otro valor.
     */
}
