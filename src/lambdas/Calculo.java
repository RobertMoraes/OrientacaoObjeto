package lambdas;

/**
 * 
 * @author Robert Moraes
 *	- Interface funcional, pois há somente um metodo.
 *	- Mesmo sem a Annotation Type FunctionalInterface quando a interface
 *		possui mais de um metodo ela deixa de ser uma interface funcional.
 *	- É possivel ter metodos diferentes de abstract.
 */
@FunctionalInterface
public interface Calculo {
	double executar(double a, double b);
	
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito Legal";
	}
}
