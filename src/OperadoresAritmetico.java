import javax.swing.*;

public class OperadoresAritmetico {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);

        System.out.println("i + j  = " + (i + j));
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j  = " + (i - j));

        int multi = i * j;
        System.out.println("multi = " + multi);
        System.out.println("i * j = " + (i * j));

        int div = i/j;
        System.out.println("div = " + div);
        float div2 = (float) i/(float) j;//i y j convertirlo(un casteo) a un flotante
        System.out.println("div2 = " + div2);

        int resto = 1 & j;
        System.out.println("resto = " + resto);
        System.out.println("i % j  = " + ( i % j) );
        resto = 8% 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if (numero %2 == 0){
            System.out.println("El numero es par");
        }else
            System.out.println("El número es impar");
    }
}
