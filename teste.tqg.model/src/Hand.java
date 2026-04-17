import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

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

    public Map<Carta.Valor, Integer> gerarMapaFrequencia() {
        Map<Carta.Valor, Integer> frequencia = new HashMap<>();
        for (Carta f: cartas) {
            frequencia.put(f.getValor(), frequencia.getOrDefault(f.getValor(),0) + 1 );
        }
        return frequencia;
    }

    public boolean temPar() {
        if (cartas.size() < 5) {return false;}
        Map<Carta.Valor, Integer> mapa = gerarMapaFrequencia();
        return mapa.containsValue(2);
    }

    public boolean temTrinca() {
        if (cartas.size() < 5) {return false;}
        Map<Carta.Valor, Integer> mapa = gerarMapaFrequencia();
        return mapa.containsValue(3);
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

    public boolean temStraight() {
        if (cartas.size() < 5) {return false;}

        int contador = 1;

        for (int i = 0; i < cartas.size() - 1; i++) {
            int v1 = cartas.get(i).getValor().ordinal();
            int v2 = cartas.get(i + 1).getValor().ordinal();

            if (v2 == v1 + 1) {contador++;
                if (contador == 5) {return true;}
            }
            else if (v2 == v1) {}
            else {
                contador = 1;
            }
            }
        return false;
    }

    public boolean temQuadra() {
        if (cartas.size() < 5) {return false;}
        for (int i = 0; i < cartas.size() - 3; i++) {
            if (cartas.get(i).getValor() == cartas.get(i + 3).getValor()) {return true;}
        }
        return false;
    }

    public boolean temFullHouse() {
        if (cartas.size() < 5) {
            return false;
        }
        int trinca = 0;
        int par = 0;
        Carta.Valor valorTrincaEncontrada = null;
        for (int i = 0; i < cartas.size() - 2; i++) {
            if (cartas.get(i).getValor() == cartas.get(i + 2).getValor()) {
                trinca++;
                valorTrincaEncontrada = cartas.get(i).getValor();
            }
        }
        for (int i = 0; i < cartas.size() - 1; i++) {
            if (cartas.get(i).getValor() == cartas.get(i + 1).getValor()) {
                if (cartas.get(i).getValor() != valorTrincaEncontrada) {par++;}
            }
        }
        if (trinca >= 1 && par >= 1) {return true;}
        return false;
    }
}
