package orientacaoobjeto.lambdas.interfaceFuncional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import orientacaoobjeto.lambdas.Produto;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = p -> System.out.println(p.getNome());;
		
		Produto produto = new Produto("Caneta", 12.35, 0.12);
		Produto produto2 = new Produto("Lápis", 7.65, 0.12);
		Produto produto3 = new Produto("Borracha", 4.80, 0.12);
		Produto produto4 = new Produto("Estojo", 23.45, 0.12);
		Produto produto5 = new Produto("Caderno", 43.65, 0.12);
		Produto produto6 = new Produto("Livro", 89.80, 0.12);
		
		List<Produto> produtos = Arrays.asList(produto, produto2, produto3, produto4, produto5, produto6);
		System.out.println("Usando consumer com accept.....");
		imprimir.accept(produto);
		System.out.println("\nUsando consumer com lista de produtos.....");
		produtos.forEach(imprimir);
		System.out.println("\nUsando consumer com lista de produtos percorrendo a lista.....");
		produtos.forEach(p -> System.out.println(p.getNome()));
	}
}
