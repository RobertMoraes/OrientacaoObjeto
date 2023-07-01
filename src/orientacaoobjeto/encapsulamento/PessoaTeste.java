package orientacaoobjeto.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Robert", "Moraes",-45);
		pessoa.setIdade(-200);
		
		System.out.println(pessoa.getIdade());
		System.out.println(pessoa);
		System.out.println(pessoa.getNomeCompleto());
	}

}
