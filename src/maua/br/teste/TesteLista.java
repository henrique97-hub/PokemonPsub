package maua.br.teste;

import maua.br.model.Carta;
import maua.br.model.ListaCartas;
import maua.br.enumeracoes.PkmRaridade;

public class TesteLista {
    public static void main(String[] args) {
        ListaCartas lista = new ListaCartas();
        System.out.println(lista);

        Carta carta1 = new Carta("teste","asx","aaa","bbb","xxx");
        Carta carta2 = new Carta("tese","as","aa","bbb","sss");

        carta1.setRaridade(PkmRaridade.RARO);
        carta2.setRaridade(PkmRaridade.LENDARIO);
        lista.add(carta1);
        lista.add(carta2);

       // for(Carta carta: lista.getLista()){
         //   System.out.println(lista);
      //  }
        System.out.println(lista);






    }

}
