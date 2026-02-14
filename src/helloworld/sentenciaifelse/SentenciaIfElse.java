package helloworld.sentenciaifelse;

import java.util.Scanner;

public class SentenciaIfElse {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa tu promedio final (en una escala de 1 a 7): ");
		double promedio = scanner.nextDouble();
		if (promedio >= 6.5){
			System.out.println("Felicidades, excelente promedio!");

		}else if (promedio >= 6.0){
			System.out.println("Muy bien, buen promedio!");

		} else if (promedio >= 5.5) {
			System.out.println("Buen promedio!");

		} else if (promedio >= 5.0) {
			System.out.println("Regular, necesitas esforzarte un poco más!");

		} else if (promedio >= 4.0) {
			System.out.println("Insuficiente, necesitas estudiar un poco más!");

		}else {
			System.out.println("Reprobado! Necesitas estudiar mucho más!");
		}
		System.out.println("Tu promedio es: " + promedio);
	}
}
