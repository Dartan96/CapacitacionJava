package helloworld.math;

import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String [] colores = {"rojo", "verde", "azul", "amarillo", "naranja", "morado"};

        double random = Math.random();
        System.out.println("Número aleatorio entre 0.0 y 1.0: " + random);

        int randomInt = (int) (Math.random() * 100);
        System.out.println("Número aleatorio entre 0 y 99: " + randomInt);

        random *= colores.length;
        System.out.println("Número aleatorio entre 0.0 y 7.0:); " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]);

        Random randomObj = new Random();
        int randonInt = 15 + randomObj.nextInt(25-15);
        System.out.println("Número aleatorio con Random: " + randonInt);
    }
}
