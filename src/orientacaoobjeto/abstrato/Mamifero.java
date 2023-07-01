package orientacaoobjeto.abstrato;

/**
 * @author Robert Moraes
 * 
 *         Usando o FINAL o metodo não pode ser implementado nas subclasses
 *         se for retirada o FINAL esse metodo poderá ser sobrescrito na subclasses
 *
 */
public abstract class Mamifero extends Animal {

	public abstract String mamar();

	@Override
	public final String mover() {

		return "Saindo do lugar";
	}
}