package orientacaoobjeto.composicaoDesafio;

public class Programa {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rafaella Moraes");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 2.50, 10);
        compra1.adicionarItem(new Produto("Notebook", 2000.00), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Lápis", 1.00, 10);
        compra2.adicionarItem(new Produto("Televisão", 3000.00), 2);

        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        System.out.println(cliente.obterValorTotal());
        System.out.println(compra1.obterValorTotal());
        System.out.println(compra2.obterValorTotal());
    }
}
