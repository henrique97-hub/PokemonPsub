package maua.br.model;

import maua.br.enumeracoes.PkmRaridade;

/**
 * Carta - essa classe possui os dados que cada carta pokemon irá conter
 * Ela possui um Contrutor que define os paramentros iniciais da carta e,
 * possui também metodos especiais para atribuir ou pegar atributos delas.
 *
 * @author Henrique Silva Godoy - RA: 16.01147-3
 * @author Lucas Menezes - RA: 16.00683-6
 *
 * @since 21/09/2020
 * @version 1.0
 */
public class Carta {
    private String url;
    private String id;
    private String nome;
    private PkmRaridade raridade;
    private String serie;
    private String colecao;

    // Construtor: parametros iniciais da carta
    public Carta(String url, String id, String nome, String serie, String colecao) {
        this.url = url;
        this.id = id;
        this.nome = nome;
        this.raridade = PkmRaridade.COMUM;
        this.serie = serie;
        this.colecao = colecao; }

    @Override
    public String toString() {
        return "Carta{" +
                "url='" + url + '\'' +
                ", id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", raridade=" + raridade +
                ", serie='" + serie + '\'' +
                ", colecao='" + colecao + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PkmRaridade getRaridade() {
        return raridade;
    }


    public void setRaridade(PkmRaridade raridade) {
        this.raridade = raridade;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getColecao() {
        return colecao;
    }

    public void setColecao(String colecao) {
        this.colecao = colecao;
    }
}

