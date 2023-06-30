package orientacaoobjeto.composicaoHeranca.composicaoDesafioHeranca;

public class CarroCivic extends Carro {

    public CarroCivic(){
        this(215);
    }

    public CarroCivic(int velocidadeMaxima){
        super(velocidadeMaxima);
//        delta = 10;
    }

//     @Override
//     public void acelerar() {
//         velocidadeAtual += 10;
//     }
}
