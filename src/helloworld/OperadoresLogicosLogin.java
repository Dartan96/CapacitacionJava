package helloworld;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "Jorge";
        usernames[1] = "Andres";
        usernames[2] = "Pepe";
        passwords[0]= "12345";
        passwords[1]= "12345";
        passwords[2] = "12345";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Igrese el Username");

        String u = scanner.next();
        System.out.println("Ingrese el password" );
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i< usernames.length; i++){
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;
//            if (usernames[i].equals(u) && passwords[i].equals(p)){
//                //  || userName2.equals(u) && password2.equals(p)
//                esAutenticado = true;
//                break;
//            }
        }
        String mensaje = esAutenticado ? "Bienvenido Usuario ".concat(u).concat("!") : "Lo siento, requiere autenticación \n username o password incorrectos!";
        System.out.println("mensaje = " + mensaje);
//        if (esAutenticado){
//            System.out.println("Bienvenido Usuario ".concat(u).concat("!"));
//        }else {
//            System.out.println("Lo siento, requiere autenticación");
//            System.out.println("Username o password incorrectos!");
//        }
    }
}
