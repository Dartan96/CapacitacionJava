package helloworld.pruebaslocales;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Lambdas {
	public static void main(String[] args) {
		// Function: T -> R
		Function<String, Integer> longitud = s -> s.length();
		System.out.println("Longitud de 'Hola': " + longitud.apply("Hola")); // 4

		// Predicate: T -> boolean
		Predicate<Integer> esPar = n -> n % 2 == 0;
		System.out.println("¿Es 4 par? " + esPar.test(4)); // true

		// Consumer: T -> void
		Consumer<String> imprimir = s -> System.out.println("Consumido: " + s);
		imprimir.accept("Hola Mundo");

		// Supplier: () -> T
		Supplier<Double> numeroAleatorio = () -> Math.random();
		System.out.println("Número aleatorio: " + numeroAleatorio.get());

		// BiFunction: (T, U) -> R
		BiFunction<Integer, Integer, Integer> sumar = (a, b) -> a + b;
		System.out.println("5 + 3 = " + sumar.apply(5, 3)); // 8

		int x = 10;
		Runnable r = () -> {
			System.out.println("El valor de x es: " + x);
		};

		// 1. Ordenar lista con lambda
		System.out.println("=== ORDENAR LISTA ===");
		List<String> nombres = Arrays.asList("Ana", "Carlos", "Beatriz");
		System.out.println("Antes de ordenar: " + nombres);
		nombres.sort((a, b) -> a.compareTo(b));
		System.out.println("Después de ordenar: " + nombres);
		System.out.println();

		// 2. Filtrar lista
		System.out.println("=== FILTRAR LISTA (números pares) ===");
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println("Lista original: " + numeros);
		List<Integer> pares = numeros.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		System.out.println("Números pares: " + pares);
		System.out.println();

		// 3. Mapear lista
		System.out.println("=== MAPEAR LISTA (longitudes) ===");
		List<String> palabras = Arrays.asList("hola", "mundo", "java");
		System.out.println("Palabras: " + palabras);
		List<Integer> longitudes = palabras.stream()
				.map(s -> s.length())
				.collect(Collectors.toList());
		System.out.println("Longitudes: " + longitudes);

		r.run(); //Este es el momento que ejecuta la lambda
	}
}
