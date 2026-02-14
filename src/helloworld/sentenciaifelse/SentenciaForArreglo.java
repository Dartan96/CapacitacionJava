package helloworld.sentenciaifelse;

import javax.swing.*;

public class SentenciaForArreglo {
	public static void main(String[] args) {

		for (int i = 1, j = 10; i < j; i++, j--) {
			System.out.println(i + " - " + j);
		}

		/*
		 *	Imprime los numero pares
		 */
//        for (int i = 0; i < 10; i++){
//            if (i%2 == 0){
//                System.out.println("El numero par es: " + i);
//            }else {
//                System.out.println("El número impar es: " + i);
//            }


//            if (!( i % 2 == 0)){ Imprime los impares
//                continue;
//            }
//            System.out.println("i = " + i);
//        }
//
		String[] nombres = {"Andres", "Marlin", "Bodoque", "Romualdo", "Renata", "Kiko"};
		int count = nombres.length;
		for (int i = 0; i < count; i++) {
//            if (nombres[i].equalsIgnoreCase("andres") || nombres[i].equalsIgnoreCase("kiko")){
//                continue;
//
//            }
			System.out.println(i + ".- " + nombres[i]);

		}
		String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Jorge\" o \"María\": ");
		System.out.println("buscar = " + buscar);

		boolean encontrado = false;
		for (int i = 0; i < count; i++) {
			if (nombres[i].equalsIgnoreCase(buscar)) {
				encontrado = true;
				break;
			}
			System.out.println("nombres = " + nombres[i]);
		}
		if (encontrado) {
			JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
		} else {
			JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema!");
		}
	}

}
