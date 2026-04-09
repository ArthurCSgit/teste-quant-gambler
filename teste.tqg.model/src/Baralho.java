import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Baralho {
    List<Carta> cartas = new ArrayList<>();

    public Baralho() {
        for (Carta.Naipe n : Carta.Naipe.values()) {
            for (Carta.Valor v : Carta.Valor.values()) {
                cartas.add(new Carta(n, v));
            }
        }
    }
    public void embaralhar() {
        Collections.shuffle(cartas);
    }
    public Carta darCarta() {
        if (cartas.isEmpty()) {
            return null;
        }
        Carta cartaRetirada = cartas.remove (cartas.size() - 1);
        return cartaRetirada;
    }
    @Override
    public String toString() { return "Baralho com " + cartas + " cartas" ; }
}