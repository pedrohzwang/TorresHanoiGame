package game;

import estruturas.*;

import java.io.IOException;

public class Jogo {

    protected static void getInfo() {
        System.out.println("Integrantes: Henrique Luiz Andrade Heemann e" +
                " Pedro Henrique Nunes Zwang");
    }

    protected static Pilha<Disco> getPilha(String tipo){
        return PilhaFactory.getPilha(tipo);
    }

    protected static Disco getDisco(Integer diametro){
        return new Disco(diametro);
    }

    protected static void limparConsole() throws IOException, InterruptedException {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        else{
            Runtime.getRuntime().exec("clear");
        }
    }

    protected static String desenhaPilha(Pilha<Disco> pilha) throws Exception{
        Pilha<Disco> pilhaTemp = pilha;
        String retorno = "";
        while (!pilhaTemp.vazia()){
            Disco temp = pilhaTemp.pop();
            retorno += temp.toString() + "\n";
        }
        return retorno;
    }

}
