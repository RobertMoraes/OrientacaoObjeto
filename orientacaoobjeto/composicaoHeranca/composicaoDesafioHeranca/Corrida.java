package orientacaoobjeto.composicaoHeranca.composicaoDesafioHeranca;

public class Corrida {
    public static void main(String[] args) {
        CarroCivic carroCivic = new CarroCivic(220);
        carroCivic.acelerar();
        carroCivic.acelerar();
        // carroCivic.acelerar();
        // carroCivic.acelerar();
        CarroJetta carroJetta = new CarroJetta(230);
        carroJetta.acelerar();
        carroJetta.acelerar();
        // carroJetta.acelerar();

        System.out.println("Civic ::: " + carroCivic);
        System.out.println("Jetta ::: " + carroJetta);

    }
}
