package main;

import game.JogoControle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println(args[0]);
        Scanner scanner = new Scanner(System.in);

        if (args[0].equalsIgnoreCase("sobre")){
            JogoControle.getInfo();
        } else{
            JogoControle.iniciar(args[0]);
        }
        String resposta = "";
        do {
            JogoControle.atualizarJogo();
            System.out.println("Digite o numero da pilha de origem");
            Integer origem = scanner.nextInt();
            System.out.println("Digite o numero da pilha de destino");
            Integer destino = scanner.nextInt();
//            JogoControle.desempilhar(origem, destino);

        } while (!resposta.equalsIgnoreCase("stop"));

    }
}
