package maua.br.teste;


import maua.br.enumeracoes.PkmRaridade;
import maua.br.model.Carta;

public class TesteCarta {
    public static void main(String[] args) {

        Carta carta1 = new Carta("teste","ex14-28","Venusaur","EX","Crystal Guardians");
        carta1.setRaridade(PkmRaridade.RARO);
        System.out.println("carta"+carta1);
        
        carta1.setRaridade(PkmRaridade.MUITO_RARO);
        System.out.println("carta"+carta1);

    }



}
