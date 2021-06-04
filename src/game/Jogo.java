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

    protected void getPilhaCorrespondente(Integer id){
        if (id == 1){

//        return Pilhas.getPilha(id); Pilha<Disco>
        }
    }

}
