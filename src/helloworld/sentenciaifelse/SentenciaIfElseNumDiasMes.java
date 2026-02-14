package helloworld.sentenciaifelse;

import java.util.Scanner;

public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero del mes. ");
        int mes = scanner.nextInt();
        int numDias = 0;
        System.out.println("Ingresa el año. ");
        int anio = scanner.nextInt();
        switch (mes){
            case 1:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
            case 2:
                if (anio%400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))){
                numDias = 29;
            }else {
                numDias = 28;
            }break;
            default:
                System.out.println("Indefinido");
        }

//        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
//            numDias = 31;
//        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
//            numDias = 30;
//        } else if (mes == 2) {
//            if (anio%400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))){
//                numDias = 29;
//            }else {
//                numDias = 28;
//            }
//
//        }
        System.out.println("Los dias que tiene el mes de "+ mes+" son " + numDias);
        if (numDias == 29){
            System.out.println("El año es bisiesto");
        }else
            System.out.println("El año no es bisiesto");
    }
}
