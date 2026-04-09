import java.sql.SQLOutput;

public class Teste {
    public static void main(String[] args) {
//        Baralho meuBaralho = new Baralho();
//        System.out.println(meuBaralho);
//        meuBaralho.embaralhar();
//        Hand minhaMao = new Hand();
//            for (int i = 0; i < 2; i++) {
//                Carta carta_sorteada = meuBaralho.darCarta();
//                minhaMao.receberCarta(carta_sorteada);
//            }
//        minhaMao.mostrarMao();
        Carta c1 = new Carta(Carta.Naipe.COPAS, Carta.Valor.AS);
        Carta c2 = new Carta(Carta.Naipe.PAUS, Carta.Valor.AS);
        Carta c3 = new  Carta(Carta.Naipe.OUROS, Carta.Valor.QUATRO);
        Hand minhaMao = new Hand ();
        minhaMao.receberCarta(c1);
        minhaMao.receberCarta(c2);
        minhaMao.receberCarta(c3);
        System.out.println("Tem trinca? " + minhaMao.temTrinca());
    }
}