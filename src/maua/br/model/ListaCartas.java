package maua.br.model;

import java.util.List;

public class ListaCartas {
private List<Carta> cartas;

    public ListaCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public void add(Carta carta){
        this.cartas.add(carta);
    }
    public List<Carta> show(Carta carta){
        return this.cartas;
    }

}
