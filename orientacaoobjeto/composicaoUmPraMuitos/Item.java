package orientacaoobjeto.composicaoUmPraMuitos;

public class Item {
    String nome;
    int quantidade;
    double preco;
    Compra compra;

    @Override
    public String toString() {
        return "Item [nome=" + nome + ", quantidade=" + quantidade 
            + ", preco=" + preco + ", compra=" + compra + "]";
    }

    Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
