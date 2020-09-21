package maua.br.model;

public class Pokemon {
    private String urlFoto, id, nome, raridade, serie, colecao;

    public Pokemon(String urlFoto, String id, String nome, String raridade, String serie, String colecao) {
        this.urlFoto = urlFoto;
        this.id = id;
        this.nome = nome;
        this.raridade = raridade;
        this.serie = serie;
        this.colecao = colecao;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRaridade() {
        return raridade;
    }

    public String getSerie() {
        return serie;
    }

    public String getColecao() {
        return colecao;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "urlFoto='" + urlFoto + '\'' +
                ", id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", raridade='" + raridade + '\'' +
                ", serie='" + serie + '\'' +
                ", colecao='" + colecao + '\'' +
                '}';
    }
}
