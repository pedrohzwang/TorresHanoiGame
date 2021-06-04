package game;

import estruturas.*;

public class Jogo {

    public static void info() {
        System.out.println("Integrantes: Henrique Luiz Andrade Heemann e" +
                " Pedro Henrique Nunes Zwang");
    }

    public static Pilha<Disco> getPilha(String tipo){
        return PilhaFactory.getPilha(tipo);
    }

    public static Disco getDisco(Integer diametro){
        return new Disco(diametro);
    }


}
