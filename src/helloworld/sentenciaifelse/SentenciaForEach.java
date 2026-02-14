package helloworld.sentenciaifelse;

public class SentenciaForEach {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        for (int num: numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Andres", "Marlin", "Bodoque", "Romualdo", "Renata", "Kiko"};
        for (String nombre : nombres){//Estructura forEach recorremos por cada elemento del arreglo dentro de la variable nombre
            System.out.println("nombre = " + nombre);
        }

    }
}
