import java.sql.SQLOutput;

public class Teste {
    public static void main(String[] args) {
        Baralho meuBaralho = new Baralho();
        System.out.println(meuBaralho);
        meuBaralho.embaralhar();
        Hand minhaMao = new Hand();
            for (int i = 0; i < 2; i++) {
                Carta carta_sorteada = meuBaralho.darCarta();
                minhaMao.receberCarta(carta_sorteada);
            }
        minhaMao.mostrarMao();
    }
}