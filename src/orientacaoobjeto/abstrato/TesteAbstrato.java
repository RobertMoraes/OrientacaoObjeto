package orientacaoobjeto.abstrato;

public class TesteAbstrato {
	public static void main(String[] args) {
		Mamifero animal = new Cachorro();
		
		System.out.println(animal.mover());
		System.out.println(animal.respirar());
		System.out.println(animal.mamar());
	}
}
