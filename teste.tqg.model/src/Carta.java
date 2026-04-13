public class Carta implements Comparable<Carta> {
    public enum Naipe {
        OUROS, ESPADAS, COPAS, PAUS;
    }
    public enum Valor {
        DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, VALETE, DAMA, REI, AS;
    }
    private final Naipe naipe;
    private final Valor valor;
    public Carta(Naipe naipe, Valor valor){
        this.naipe = naipe;
        this.valor = valor;
    }
    public Valor getValor() {
        return valor;
    }
    public Naipe getNaipe() {
        return naipe;
    }
    @Override
    public int compareTo(Carta outra) {
        return this.getValor().compareTo(outra.getValor());
    }
    @Override
    public String toString() {
        return valor + " de " + naipe ;
    }
}
