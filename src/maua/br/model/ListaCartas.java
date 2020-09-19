package maua.br.model;

import java.util.ArrayList;
import java.util.List;

public class ListaCartas{
private List<Carta> Listas_de_cartas;

    // Construtor que instancia o arraylist, assim que ele for criado
    public ListaCartas() { this.Listas_de_cartas = new ArrayList<>(); }



    public void add(Carta carta){
        this.Listas_de_cartas.add(carta);
    }


    @Override
    public String toString() {
        return "ListaCartas{" +
                "Listas_de_cartas=" + Listas_de_cartas +
                '}';
    }
    public final List<Carta> getLista(){
        return this.Listas_de_cartas;
    }


}
