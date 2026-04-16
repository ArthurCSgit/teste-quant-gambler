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
        Carta c1 = new Carta(Carta.Naipe.COPAS, Carta.Valor.SETE);
        Carta c2 = new Carta(Carta.Naipe.OUROS, Carta.Valor.VALETE);
        Carta c3 = new Carta(Carta.Naipe.COPAS, Carta.Valor.DOIS);
        Carta c4 = new Carta(Carta.Naipe.ESPADAS, Carta.Valor.SEIS);
        Carta c5 = new Carta(Carta.Naipe.PAUS, Carta.Valor.VALETE);
        Carta c6 = new Carta(Carta.Naipe.OUROS, Carta.Valor.SEIS);
        Carta c7 = new Carta(Carta.Naipe.OUROS, Carta.Valor.QUATRO);
        Hand minhaMao = new Hand ();
        minhaMao.receberCarta(c1);
        minhaMao.receberCarta(c2);
        minhaMao.receberCarta(c3);
        minhaMao.receberCarta(c4);
        minhaMao.receberCarta(c5);
        minhaMao.receberCarta(c6);
        minhaMao.receberCarta(c7);
        minhaMao.ordenarMao();
        System.out.println("Tem full house? " + minhaMao.temFullHouse());
    }
}