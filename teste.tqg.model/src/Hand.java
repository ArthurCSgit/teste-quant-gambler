import java.util.ArrayList;
import java.util.Collections;
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
    public void ordenarMao() {
        Collections.sort(cartas);
    }
    public boolean temPar() {
        for (int i = 0; i < cartas.size() - 1; i++) {
            if ( cartas.get(i).getValor() == cartas.get(i + 1).getValor()) {return true;}
        }
        return false;
    }
    public boolean temTrinca() {
        if (cartas.size() < 3) {return false;}
        for (int i =0; i < cartas.size() - 2; i++) {
            if ( cartas.get(i).getValor() == cartas.get(i + 2).getValor()) {return true;}
        }
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
