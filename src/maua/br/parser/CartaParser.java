package maua.br.parser;
import org.json.JSONObject;
import maua.br.model.Carta;

/**
 * CartaParser - Classe que recebe os dados da carta e converte para arquivos Json
 * Nela também possui o fromJson, que recebe o arquivo do tipo Json e converte para carta e,
 * possui também um método especial para atualizar a raridade da carta
 *
 * @author Henrique Silva Godoy - RA: 16.01147-3
 * @author Lucas Menezes - RA: 16.00683-6
 *
 * @since 21/09/2020
 * @version 1.0
 */

public class CartaParser {
    public static JSONObject toJson(Carta carta){
        JSONObject json = new JSONObject();
        json.put("url",carta.getUrl());
        json.put("id",carta.getId());
        json.put("nome", carta.getNome());
        json.put("raridade",carta.getRaridade());
        json.put("serie",carta.getSerie());
        json.put("colecao",carta.getColecao());
        return json;
    }


    public static Carta fromJson(JSONObject json){
        Carta carta = new Carta(
                json.getString("url"),
                json.getString("id"),
                json.getString("nome"),
                json.getString("serie"),
                json.getString("colecao")
        );

        carta.setRaridade(
                StatusParser.toStatus(json.getString("status"))
        );
        return carta;
    }

}
