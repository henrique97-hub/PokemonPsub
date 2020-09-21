package maua.br.teste;


import maua.br.enumeracoes.PkmRaridade;
import maua.br.model.Carta;

/**
 * TesteCarta - Classe criada para testes do programa, afim de detectar falhas na execussão do programa
 *
 * @author Henrique Silva Godoy - RA: 16.01147-3
 * @author Lucas Menezes - RA: 16.00683-6
 *
 * @since 21/09/2020
 * @version 1.0
 *
 */
public class TesteCarta {
    public static void main(String[] args) {

        Carta carta1 = new Carta("teste","ex14-28","Venusaur","EX","Crystal Guardians");
        carta1.setRaridade(PkmRaridade.RARO);
        System.out.println("carta"+carta1);

        carta1.setRaridade(PkmRaridade.MUITO_RARO);
        System.out.println("carta"+carta1);

    }



}
