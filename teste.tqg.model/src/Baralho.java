import java.util.ArrayList;
import java.util.List;
public class Baralho {
    List<Carta> cartas = new ArrayList<>();

    public Baralho() {
        for (Carta.Naipe n : Carta.Naipe.values()) {
            for (Carta.Valor v : Carta.Valor.values()) {
                cartas.add(new Carta(n, v));
            }
        }
    }

    public void mostrarBaralho() {
        for (Carta c : cartas) {
            System.out.println(c);
        }
    }
}