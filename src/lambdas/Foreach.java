package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<String> aprovados = Arrays
				.asList("Ana", "Bia", "Lia", "Tina");
		
		System.out.println("Forma tradicional de percorrer....");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nPercorrer usando lambda.....");
		aprovados.forEach((nome) -> {
			System.out.println(nome + "!!!");
		});
		
		System.out.println("\nMethod Reference.....");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nPercorrer usando lambda e imprimir personalizado.....");
		aprovados.forEach((nome) -> {
			imprimir(nome);
		});
		
		System.out.println("\nMethod Reference e imprimir personalizado.....");
		aprovados.forEach(Foreach::imprimir);
	}
	
	static void imprimir(String nome) {
		System.out.println("Oi meu nome é " + nome);
	}

}
