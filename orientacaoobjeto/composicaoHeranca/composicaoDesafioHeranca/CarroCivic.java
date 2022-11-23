package orientacaoobjeto.composicaoHeranca.composicaoDesafioHeranca;

public class CarroCivic extends Carro {

    CarroCivic(){
        this(215);
    }

    CarroCivic(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 10;
    }

    // @Override
    // void acelerar() {
    //     velocidadeAtual += 10;
    // }
}
