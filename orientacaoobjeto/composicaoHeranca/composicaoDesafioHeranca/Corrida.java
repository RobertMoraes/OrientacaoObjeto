package orientacaoobjeto.composicaoHeranca.composicaoDesafioHeranca;

public class Corrida {
    public static void main(String[] args) {
        CarroCivic carroCivic = new CarroCivic();
        carroCivic.acelerar();
        carroCivic.acelerar();
        carroCivic.acelerar();
        carroCivic.acelerar();
        CarroJetta carroJetta = new CarroJetta();
        carroJetta.acelerar();
        carroJetta.acelerar();
        carroJetta.acelerar();

        System.out.println("Civic ::: " + carroCivic);
        System.out.println("Jetta ::: " + carroJetta);

    }
}
