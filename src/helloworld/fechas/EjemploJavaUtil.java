package helloworld.fechas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtil {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        /*
         * El formato de fecha que se muestra por consola es el formato por defecto del sistema operativo,
         *  pero podemos cambiarlo a un formato personalizado usando la clase SimpleDateFormat.
         *
         * El formato de fecha se define usando patrones de formato,
         * donde cada letra representa una parte de la fecha.
         *
         * Por ejemplo, el patrón "dd MMMM,yyyy" representa el día del mes con dos dígitos (dd),
         * el nombre completo del mes (MMMM) y el año con cuatro dígitos (yyyy).
         * El formato MM representa el mes con dos dígitos, mientras que MMM representa el nombre abreviado del mes.
         */
        SimpleDateFormat df = new SimpleDateFormat("dd MMMM,yyyy");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);


    }
}
