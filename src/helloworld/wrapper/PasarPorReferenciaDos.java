package helloworld.wrapper;

class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return nombre;
    }
}

public class PasarPorReferenciaDos {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Jorge");

        System.out.println("Iniciamos el método main");

        System.out.println("persona.nombre = " + persona.leerNombre());
        System.out.println("Antes de llamar el método test");
        test(persona);
        System.out.println("Después de llamar el método test");

        System.out.println("persona.nombre = " + persona.leerNombre());

        System.out.println("Finaliza el método main con los datos de la persona modificados!");

    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el métiodo test");
        persona.modificarNombre("Juan");
        System.out.println("Finaliza el método test");
    }
}
