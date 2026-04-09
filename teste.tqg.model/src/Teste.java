public class Teste {
    public static void main(String[] args) {
        Baralho meuBaralho = new Baralho();
        meuBaralho.mostrarBaralho();
        meuBaralho.embaralhar();
        Hand minhaMao = new Hand();
            for (int i = 0; i < 2; i++) {
                Carta carta_sorteada = meuBaralho.darCarta();
                minhaMao.receberCarta(carta_sorteada);
            }
        minhaMao.mostrarMao();
//     Carta c1 = new Carta(Carta.Naipe.COPAS, Carta.Valor.AS);
//     Carta c2 = new Carta(Carta.Naipe.OUROS, Carta.Valor.SETE);
//     Hand minhaMao = new Hand (); //ESTE É O CÓDIGO PARA VERIFICAR SE TEM PAR OU NÃO
//     minhaMao.receberCarta(c1);
//     minhaMao.receberCarta(c2);
//        System.out.println("Tem par? " + minhaMao.temPar());
    }
}