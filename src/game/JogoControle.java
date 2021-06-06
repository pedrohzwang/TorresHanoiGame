package game;

import estruturas.Disco;
import estruturas.Pilha;


public class JogoControle {

    static Pilha<Disco> origem = null;
    static Pilha<Disco> aux = null;
    static Pilha<Disco> destino = null;

    public static void getInfo() {
        Jogo.getInfo();
    }

    public static void iniciar(String[] args) throws Exception {
        origem = Jogo.getPilha(args[0]);
        aux = Jogo.getPilha(args[0]);
        destino = Jogo.getPilha(args[0]);

        //discos invisíveis - base
        origem.push(Jogo.getDisco(1000));
        aux.push(Jogo.getDisco(1000));
        destino.push(Jogo.getDisco(1000));


        /*origem.push(Jogo.getDisco(5));
        origem.push(Jogo.getDisco(4));
        origem.push(Jogo.getDisco(3));
        origem.push(Jogo.getDisco(2));
        origem.push(Jogo.getDisco(1));*/
        origem.push(Jogo.getDisco(1));
        destino.push(Jogo.getDisco(5));
        destino.push(Jogo.getDisco(4));
        destino.push(Jogo.getDisco(3));
        destino.push(Jogo.getDisco(2));


        //System.out.println("Pilha origem: " + origem.toString());
    }

    public static void desempilhar(Pilha<Disco> pilhaOrigem, Pilha<Disco> pilhaDestino) throws Exception {
        //JogoControle.imprimePilha(origem);
        System.out.println(pilhaOrigem.equals(pilhaDestino));
        System.out.println(pilhaOrigem.top().getDiametro());
        System.out.println(pilhaDestino.top().getDiametro());
        if (!pilhaOrigem.equals(pilhaDestino) && pilhaOrigem.top().getDiametro() < pilhaDestino.top().getDiametro()){
            Disco disco = pilhaOrigem.pop();
            pilhaDestino.push(disco);
        }
    }

    public static void atualizarJogo() throws Exception {
        Jogo.limparConsole();
        System.out.println("1)\n" + Jogo.desenhaPilha(origem) +
                "2)\n" + Jogo.desenhaPilha(aux) +
                "3)\n" + Jogo.desenhaPilha(destino));
        /*System.out.print("1) " + Jogo.desenhaPilha(origem));
        System.out.print("2) " + Jogo.desenhaPilha(aux));
        System.out.print("3) " + Jogo.desenhaPilha(destino));*/
    }

    public static Pilha<Disco> retornaPilhaInstancia(Integer id){
        Pilha<Disco> pilhaRetorno = null;
        switch (id){
            case 1:
                pilhaRetorno = origem;
                break;
            case 2:
                pilhaRetorno = aux;
                break;
            case 3:
                pilhaRetorno = destino;
                break;
        }
        JogoControle.imprimePilha(pilhaRetorno);
        return pilhaRetorno;
    }

    public static Pilha<Disco> atualizarPilha(){
        return null;
    }

    public static void imprimePilha(Pilha<Disco> pilha){
        System.out.println(pilha.toString());
    }

    public static boolean venceu() throws Exception {
        return Jogo.pilhaCheia(destino);
    }
}
