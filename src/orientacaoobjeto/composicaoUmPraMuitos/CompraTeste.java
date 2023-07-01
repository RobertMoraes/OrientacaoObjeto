package orientacaoobjeto.composicaoUmPraMuitos;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "Joao Carlos";
        compra1.adicionarItem("Caneta", 20, 2.50);
        compra1.adicionarItem("Borracha", 10, 4.80);
        compra1.adicionarItem("Caderno", 15, 24.99);

        System.out.println(compra1.itens.size());
        System.out.println(Math.rint(compra1.obterValorTotal()*100)/100);

        // for (int i = 0; i < compra1.itens.size(); i++) {
        //     System.out.println(compra1.itens.get(i));
        // }

        for(Item item: compra1.itens){
            System.out.println("Item comprado: " + item);
        }
        
    }
}
