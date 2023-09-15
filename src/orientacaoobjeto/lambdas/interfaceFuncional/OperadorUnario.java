package orientacaoobjeto.lambdas.interfaceFuncional;

import java.util.function.UnaryOperator;

import javax.swing.JOptionPane;

public class OperadorUnario {

	public static void main(String[] args) {
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;

		int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
		System.out.println(resultado1);

		int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
		System.out.println(resultado2);

		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Qual a tabuada?"));
		for (int i = 0; i <= 10; i++) {
			UnaryOperator<Integer> vezesN = n -> n * tabuada;
			int result = vezesN.apply(i);
			System.out.println("Reseultado: " + result);
		}

		for (int i = 0; i <= 100; i++) {
			int result = i * tabuada;
			if (result % 2 == 0) {
				System.out.println("Reseultado numero PAR: " + result);
			} else {
				System.out.println("Reseultado numero IMPAR: " + result);
			}

		}
	}

}
