package orientacaoobjeto.composicaoHeranca.composicaoDesafioHeranca;

public class CarroJetta extends Carro{
    public CarroJetta(){
        this(250);
    }

    public CarroJetta(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 15;
    }
}
