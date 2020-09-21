package maua.br.parser;
import maua.br.model.ListaCartas;
import org.json.JSONArray;
import org.json.JSONObject;

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
