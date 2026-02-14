//package helloworld.tareas.seccion4;
//
//import java.util.Scanner;
//
//public class NombreMasLargo {
//    public static void main(String[] args) {
//        String nombre1 = "", nombre2 = "", nombre3 = "";
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Dame el primer nombre con apellidos");
//        nombre1 = scanner.nextLine();
//        System.out.println("Dame el segundo nombre con apellidos");
//        nombre2 = scanner.nextLine();
//        System.out.println("Dame el tercer nombre con apellidos");
//        nombre3 = scanner.nextLine();
//
//    }
//}


package helloworld.tareas.seccion4;

import javax.swing.JOptionPane;

public class NombreMasLargo {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Dame el primer nombre con apellidos");
        String nombre2 = JOptionPane.showInputDialog("Dame el segundo nombre con apellidos");
        String nombre3 = JOptionPane.showInputDialog("Dame el tercer nombre con apellidos");

        String nombreMasLargo = (nombre1.length() >= nombre2.length() && nombre1.length() >= nombre3.length()) ? nombre1 :
                (nombre2.length() >= nombre1.length() && nombre2.length() >= nombre3.length()) ? nombre2 : nombre3;

        JOptionPane.showMessageDialog(null, nombreMasLargo + " tiene el nombre más largo.");
    }
}
