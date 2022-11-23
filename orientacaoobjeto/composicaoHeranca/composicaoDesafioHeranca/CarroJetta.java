package orientacaoobjeto.composicaoHeranca.composicaoDesafioHeranca;

public class CarroJetta extends Carro{
    CarroJetta(){
        this(250);
    }

    CarroJetta(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 15;
    }
}
