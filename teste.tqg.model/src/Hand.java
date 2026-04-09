import java.util.ArrayList;
import java.util.List;
public class Hand {
    List<Carta> cartas = new ArrayList<Carta>();

    public void receberCarta(Carta cartaRecebida) {
        cartas.add(cartaRecebida);
    }
    public void mostrarMao() {
        for  (Carta m: cartas) {
            System.out.println(m);
        }
    }
    public boolean temPar() {
       if (cartas.size() < 2) {return false;}
       if (cartas.get(0).getValor() == cartas.get(1).getValor()) {return true;}
       return false;
    }
    public boolean temTrinca() {
        if (cartas.size() < 3) {return false;}
        if ((cartas.get(0).getValor() == cartas.get(1).getValor()) && (cartas.get(1).getValor() == cartas.get(2).getValor())) {return true;}
        return false;
    }
    public boolean temFlush() {
        if (cartas.size() != 5) {return false;}
        Carta.Naipe naipeReferencia = cartas.get(0).getNaipe();
            for  (Carta c : cartas) {
                if (c.getNaipe() != naipeReferencia) {return false;}
            }
        return true;
    }
}
