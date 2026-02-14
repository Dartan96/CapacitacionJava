package helloworld.wrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo); //Se convierte el int primitivo a un objeto Integer usando el método valueOf()
        Integer intObjeto2 = 32768; // autoboxing, el compilador lo convierte a Integer.valueOf(32768)

        int num = intObjeto; //Convierte de Wrapper a primitivo (unboxing)
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue(); //Convierte de Wrapper a primitivo usando el método intValue()
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd); //Convierte el String a Integer usando el método valueOf()
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue(); // autoboxing, el compilador lo convierte a Short.valueOf(32767)
    }
}
