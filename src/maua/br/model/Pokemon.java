package maua.br.model;

/**
 * Pokemon - Essa classe contém os dados que serão utilizados na interface grafica (JavaFx)
 *
 * @author Henrique Silva Godoy - RA: 16.01147-3
 * @author Lucas Menezes - RA: 16.00683-6
 *
 * @since 21/09/2020
 * @version 1.0
 */
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

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setColecao(String colecao) {
        this.colecao = colecao;
    }
}
