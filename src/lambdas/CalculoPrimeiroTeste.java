package lambdas;

public class CalculoPrimeiroTeste {
	public static void main(String[] args) {
		Calculo calcular = new Soma();
		
		System.out.println(calcular.executar(3, 3));
		
		calcular = new Multiplicar();
		
		System.out.println(calcular.executar(3, 3));
	}
}
