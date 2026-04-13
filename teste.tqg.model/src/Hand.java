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
        if (cartas.size() < 5) {return false;}
        int qtdCopas = 0;
        int qtdEspadas = 0;
        int qtdOuros = 0;
        int qtdPaus = 0;
        for (int i =0; i < cartas.size(); i++) {
            if (cartas.get(i).getNaipe() == Carta.Naipe.COPAS) {
                qtdCopas++; }
            else if (cartas.get(i).getNaipe() == Carta.Naipe.ESPADAS) {
                    qtdEspadas++; }
            else if (cartas.get(i).getNaipe() == Carta.Naipe.OUROS) {
                        qtdOuros++; }
            else if (cartas.get(i).getNaipe() == Carta.Naipe.PAUS) {
                            qtdPaus++; }
            if (qtdCopas >= 5) {return true;}
            else if (qtdEspadas >= 5)  {return true;}
            else if (qtdOuros >= 5)   {return true;}
            else if (qtdPaus >= 5)  {return true;}
        }
        return false;
    }

}
