package helloworld.math;

public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("Valor absoluto de -3: " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("Valor absoluto de 3: " + absoluto);

        double maximo = Math.max(3.5, 2.8);
        System.out.println("Valor máximo entre 3.5 y 2.8: " + maximo);

        double minimo = Math.min(3.5, 2.8);
        System.out.println("Valor mínimo entre 3.5 y 2.8: " + minimo);

        double techo = Math.ceil(3.2);
        System.out.println("Valor techo de 3.2: " + techo);

        double piso = Math.floor(3.8);
        System.out.println("Valor piso de 3.8: " + piso);

        long redondeo = Math.round(3.6);
        System.out.println("Valor redondeado de 3.6: " + redondeo);

        long pi = Math.round(Math.PI);
        System.out.println("Valor redondeado de PI: " + pi);

        double exp = Math.exp(2);
        System.out.println("Valor de e^1: " + exp);

        double log = Math.log(10);
        System.out.println("Valor de logaritmo natural de 10: " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("Valor de 10 elevado a la potencia de 3: " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("Valor de la raíz cuadrada de 5: " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("Convertir de radianes a grados: " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("Convertir de grados a radianes: " + radianes);

        System.out.println("Seno de 90 grados: " + Math.sin(radianes));
        System.out.println("Coseno de 90 grados: " + Math.cos(radianes));

        radianes = Math.toRadians(180.00);
        System.out.println("Coseno de 180 grados: " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("Coseno de 0 grados: " + Math.cos(radianes));

    }
}
