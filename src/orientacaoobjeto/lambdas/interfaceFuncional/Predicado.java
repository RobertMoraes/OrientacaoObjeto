package orientacaoobjeto.lambdas.interfaceFuncional;

import java.util.function.Predicate;

import orientacaoobjeto.lambdas.Produto;

public class Predicado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Produto> isCaro = produto -> (produto.getPreco() * (1 - produto.getDesconto())) >= 1500.00;

		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto));

	}

}
