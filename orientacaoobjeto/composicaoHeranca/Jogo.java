package orientacaoobjeto.composicaoHeranca;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstroJogador = new Monstro(10,10);

        Heroi heroiJogador = new Heroi(10,11);

        System.out.println("Vida Player 01 :: " + monstroJogador.vida);
        System.out.println("Vida Player 02 :: " + heroiJogador.vida);

        monstroJogador.atacar(heroiJogador);
        heroiJogador.atacar(monstroJogador);

        System.out.println("Monstro tem :: " + monstroJogador.vida);
        System.out.println("Heroi tem :: " + heroiJogador.vida);


    }
}
