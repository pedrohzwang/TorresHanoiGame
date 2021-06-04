package game;

import estruturas.Disco;
import estruturas.Pilha;

import java.io.IOException;

public class JogoControle {

    private static Pilha<Disco> origem = null;
    private static Pilha<Disco> aux = null;
    private static Pilha<Disco> destino = null;

    public static void getInfo() {
        Jogo.getInfo();
    }

    public static void iniciar(String args) throws Exception {

        origem = Jogo.getPilha(args);
        aux = Jogo.getPilha(args);
        destino = Jogo.getPilha(args);

        origem.push(Jogo.getDisco(5));
        origem.push(Jogo.getDisco(4));
        origem.push(Jogo.getDisco(3));
        origem.push(Jogo.getDisco(2));
        origem.push(Jogo.getDisco(1));

        System.out.println("Pilha origem: " + origem.toString());

    }

    public static void desempilhar(Integer idOrigem, Integer idDestino) throws Exception {
        Integer vet[] = new Integer[2];
        vet[0] = idOrigem;
        vet[1] = idDestino;
        Pilha<Disco> pilhaInicial;
        Pilha<Disco> pilhaFinal;
        for (int i = 0; i < vet.length; i++){
            Integer valor = vet[i];
            if (valor == 1){
            }
        }
        atualizarJogo();
    }

    public static void atualizarJogo() throws IOException, InterruptedException {
        Jogo.limparConsole();
        System.out.println("Pilha 1: " + origem.toString());
        System.out.println("Pilha 2: " + aux.toString());
        System.out.println("Pilha 3: " + destino.toString());
    }
}
