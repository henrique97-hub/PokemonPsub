package maua.br.parser;
import maua.br.model.ListaCartas;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * ListaParser - Faz o parser para a lista de cartas pokémon
 *
 * @author Henrique Silva Godoy - RA: 16.01147-3
 * @author Lucas Menezes - RA: 16.00683-6
 *
 * @since 21/09/2020
 * @version 1.0
 */
public class ListaParser {
    public static JSONArray toJson(ListaCartas lista){
        JSONArray json = new JSONArray();
        lista.getLista().forEach(carta -> {
            json.put(CartaParser.toJson(carta));
        } );
        return json;
    }
    public static ListaCartas fromJson(JSONArray json){
        ListaCartas lista = new ListaCartas();
        json.forEach(item -> {
            lista.add(ListaParser.fromJson((JSONObject) item));
        });
        return lista;
    }
}
