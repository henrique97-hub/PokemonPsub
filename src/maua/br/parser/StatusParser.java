package maua.br.parser;

import jdk.net.SocketFlow;
import maua.br.enumeracoes.PkmRaridade;

public class StatusParser {
    public static PkmRaridade toStatus(String status){
        if(status.equals("comum")) return PkmRaridade.COMUM;
        if(status.equals("incomum")) return PkmRaridade.INCOMUM;
        if(status.equals("raro")) return PkmRaridade.RARO;
        if(status.equals("muito raro")) return PkmRaridade.MUITO_RARO;
        if(status.equals("epico")) return PkmRaridade.EPICO;
        if(status.equals("lendario")) return PkmRaridade.LENDARIO;
        else return PkmRaridade.ERRO;


    }

}
