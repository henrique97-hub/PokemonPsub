package maua.br.enumeracoes;

/**
 * PkmRaridade - essa Classe é uma enumeração que possui os 6 tipos das cartas de Pokémons,
 * juntamente com os seus significados
 * @author Henrique Silva Godoy - RA: 16.01147-3
 * @author Lucas Menezes - RA: 16.00683-6
 *
 * @since 21/09/2020
 * @version 1.0
 */

public enum PkmRaridade {
    COMUM {
    @Override
    public String toString(){ return "Pokémon do tipo comum";}
},

    INCOMUM {
    @Override
    public String toString(){return "Pokémon do tipo incomum";}
},
    RARO {
        @Override
        public String toString() {return "Pokémon do tipo raro";}

    },
    MUITO_RARO {
        @Override
        public String toString() {return "Pokémon do tipo muito raro";}
    },
    EPICO {
        @Override
        public String toString() { return "Pokémon do tipo épico";}

        },
    LENDARIO {
        @Override
        public String toString() { return "Pokémon do tipo lendário";}

        },
    ERRO
      {
        @Override
        public String toString() { return "Algo esta errado";}
    };

    }



