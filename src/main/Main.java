package main;

import estruturas.Disco;
import estruturas.Pilha;
import game.JogoControle;
import java.util.Scanner;

public class Main {

    static Pilha<Disco> origem = null;
    static Pilha<Disco> aux = null;
    static Pilha<Disco> destino = null;

    public static void main(String[] args) throws Exception{

        System.out.println(args[0]);

        if (args[0].equalsIgnoreCase("sobre")){
            JogoControle.getInfo();
        } else{
            comecar(args);
        }


    }

    public static void comecar(String[] args) throws Exception {
        origem = JogoControle.criarPilha(args[0]);
        aux = JogoControle.criarPilha(args[0]);
        destino = JogoControle.criarPilha(args[0]);
        String resposta = "";
        Scanner scanner = new Scanner(System.in);
        do {
            JogoControle.atualizarJogo(origem, aux, destino);
            System.out.println("Digite o numero da pilha de origem");
            Integer idOrigem = scanner.nextInt();
            System.out.println("Digite o numero da pilha de destino");
            Integer idDestino = scanner.nextInt();
            JogoControle.desempilhar(idOrigem, idDestino, origem, aux, destino);

        } while (!resposta.equalsIgnoreCase("stop"));
    }

}
