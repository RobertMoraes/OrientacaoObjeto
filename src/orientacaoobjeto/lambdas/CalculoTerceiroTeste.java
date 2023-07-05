package orientacaoobjeto.lambdas;

import java.util.function.BinaryOperator;

public class CalculoTerceiroTeste {
	public static void main(String[] args) {
		BinaryOperator<Double> calcular = (x, y) -> {
			return x + y;
		};
		System.out.println(calcular.apply((double) 3, (double) 3));
		
		calcular = (x, y) -> x + y;
		System.out.println(calcular.apply((double)2, (double) 4));
		
		calcular = (x, y) -> x * y;
		System.out.println(calcular.apply((double) 3, (double) 3));
		
	}
}
