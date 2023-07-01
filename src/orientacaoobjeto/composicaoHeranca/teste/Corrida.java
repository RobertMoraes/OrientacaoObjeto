package orientacaoobjeto.composicaoHeranca.teste;

import orientacaoobjeto.composicaoHeranca.composicaoDesafioHeranca.CarroJetta;

public class Corrida {
    public static void main(String[] args) {
//        CarroCivic carroCivic = new CarroCivic(220);
//        carroCivic.acelerar();
//        carroCivic.acelerar();
//        // carroCivic.acelerar();
//        // carroCivic.acelerar();
        CarroJetta carroJetta = new CarroJetta();
        carroJetta.acelerar();
        carroJetta.ligarTurbo();
        carroJetta.acelerar();
        carroJetta.ligarTurbo();
        carroJetta.ligarTurbo();
//        carroJetta.acelerar();

//        System.out.println("Civic ::: " + carroCivic);
        System.out.println("Jetta ::: " + carroJetta);

    }
}
