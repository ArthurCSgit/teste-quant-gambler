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
       if (cartas.get(0).getValor() == cartas.get(1).getValor()) {return true;}
       return false;
    }
}
