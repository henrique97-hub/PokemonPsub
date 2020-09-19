package maua.br.enumeracoes;

// Significado do Enum
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



