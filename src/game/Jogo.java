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
        Disco discos[] = new Disco[6];
        int contador = 5;
        String retorno = "";
        while (pilha.top().getDiametro() < 1000){
            Disco temp = pilha.pop();
            discos[contador] = temp;
            contador--;
            retorno += temp.toString() + "\n";
        }

        for (int i = 0; i < discos.length; i++){
            if (discos[i] != null/* && discos[i].getDiametro() > 0*/){
                pilha.push(discos[i]);
            }
        }
        return retorno;
    }

    protected static boolean pilhaCheia(Pilha<Disco> pilha) throws Exception{
        Disco discos[] = new Disco[6];
        int contador = 5;
        while (pilha.top().getDiametro() < 1000){
            Disco temp = pilha.pop();
            discos[contador] = temp;
            contador--;
        }

        contador = 0;
        for (int i = 0; i < discos.length; i++){
            if (discos[i] != null){
                pilha.push(discos[i]);
                contador++;
            }
        }
        return contador == 5;
    }
}
