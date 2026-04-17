import java.sql.SQLOutput;

public class Teste {
    public static void main(String[] args) {

        System.out.println("--- INICIANDO TESTES ---");
        //======================================================
        //CENÁRIO 1: MÃO COM PAR (EX: DOIS ASES)
        //======================================================

        Carta c1 = new Carta(Carta.Naipe.COPAS, Carta.Valor.VALETE);
        Carta c2 = new Carta(Carta.Naipe.OUROS, Carta.Valor.AS);
        Carta c3 = new Carta(Carta.Naipe.COPAS, Carta.Valor.QUATRO);
        Carta c4 = new Carta(Carta.Naipe.ESPADAS, Carta.Valor.AS);
        Carta c5 = new Carta(Carta.Naipe.PAUS, Carta.Valor.AS);
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

        boolean resultadoTeste1 = minhaMao.temFullHouse();
        System.out.println("Teste 1 (Tem trinca? Esperado: true) -> " + resultadoTeste1);
    }
}