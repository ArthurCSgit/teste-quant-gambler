public class Carta {
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

    @Override
    public String toString() {
        return valor + " de " + naipe ;
    }
}
