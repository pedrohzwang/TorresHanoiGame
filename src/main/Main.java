package main;

import estruturas.Disco;
import estruturas.Pilha;
import game.Jogo;

public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println(args[0]);
        Pilha<Disco> origem = null;
        Pilha<Disco> aux = null;
        Pilha<Disco> destino = null;

        if (args[0].equalsIgnoreCase("sobre")){
            Jogo.info();
        } else{
            origem = Jogo.getPilha(args[0]);
            aux = Jogo.getPilha(args[0]);
            destino = Jogo.getPilha(args[0]);

            origem.push(Jogo.getDisco(1));
            origem.push(Jogo.getDisco(2));
            origem.push(Jogo.getDisco(3));
            origem.push(Jogo.getDisco(4));
            origem.push(Jogo.getDisco(5));
        }

    }
}
