package game;

import estruturas.Disco;
import estruturas.Pilha;


public class JogoControle {

    public static void getInfo() {
        Jogo.getInfo();
    }

    public static void iniciar(String args, Pilha<Disco> origem, Pilha<Disco> aux, Pilha<Disco> destino) throws Exception {
        origem.push(Jogo.getDisco(5));
        origem.push(Jogo.getDisco(4));
        origem.push(Jogo.getDisco(3));
        origem.push(Jogo.getDisco(2));
        origem.push(Jogo.getDisco(1));

        System.out.println("Pilha origem: " + origem.toString());
    }

    public static Pilha<Disco> criarPilha(String tipo){
        return Jogo.getPilha(tipo);
    }

    public static void desempilhar(Integer idOrigem, Integer idDestino, Pilha<Disco> origem, Pilha<Disco> aux, Pilha<Disco> destino) throws Exception {

        Pilha<Disco> pilhaOrigem = retornaPilhaInstancia(idOrigem, origem, aux, destino);
        Pilha<Disco> pilhaDestino = retornaPilhaInstancia(idDestino, origem, aux, destino);

        Disco removido = origem.pop();
        destino.push(removido);
        System.out.println(Jogo.desenhaPilha(origem));
        System.out.println(Jogo.desenhaPilha(aux));
        System.out.println(Jogo.desenhaPilha(destino));
        //atualizarJogo();
    }

    public static void atualizarJogo(Pilha<Disco> origem, Pilha<Disco> aux, Pilha<Disco> destino) throws Exception {
        Jogo.limparConsole();
        System.out.println(Jogo.desenhaPilha(origem));
        System.out.println(Jogo.desenhaPilha(aux));
        System.out.println(Jogo.desenhaPilha(destino));
    }

    private static Pilha<Disco> retornaPilhaInstancia(Integer id, Pilha<Disco> origem, Pilha<Disco> aux, Pilha<Disco> destino){
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
        return pilhaRetorno;
    }
}
