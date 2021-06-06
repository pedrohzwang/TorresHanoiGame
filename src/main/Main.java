package main;

import game.JogoControle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        if (args[0].equalsIgnoreCase("sobre")){
            JogoControle.getInfo();
        } else{
            comecar(args);
        }
    }

    public static void comecar(String[] args) throws Exception {
        JogoControle.iniciar(args);
        Scanner scanner = new Scanner(System.in);
        do {
            JogoControle.atualizarJogo();
            System.out.println("Digite o numero da pilha de origem (1, 2 ou 3)");
            Integer idOrigem = scanner.nextInt();
            System.out.println("Digite o numero da pilha de destino (1, 2 ou 3)");
            Integer idDestino = scanner.nextInt();
            JogoControle.desempilhar(JogoControle.retornaPilhaInstancia(idOrigem), JogoControle.retornaPilhaInstancia(idDestino));
        } while (!JogoControle.venceu());
        JogoControle.atualizarJogo();
        System.out.println("Voce conseguiu!!");
    }

}
