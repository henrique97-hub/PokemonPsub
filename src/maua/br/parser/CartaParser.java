package maua.br.parser;
import org.json.JSONObject;
import maua.br.model.Carta;

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
        // Para atualizar a raridade
        carta.setRaridade(
                StatusParser.toStatus(json.getString("status"))
        );
        return carta;
    }

}
