package maua.br.model;

import java.util.ArrayList;
import java.util.List;

/**
 * ListaCartas - Classe que contém uma lista com todas as cartas criadas
 *
 * @author Henrique Silva Godoy - RA: 16.01147-3
 * @author Lucas Menezes - RA: 16.00683-6
 *
 * @since 21/09/2020
 * @version 1.0
 */
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
