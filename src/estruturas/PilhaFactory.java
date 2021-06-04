package estruturas;

public class PilhaFactory<T> {

    public static Pilha<Disco> getPilha(String tipo){
        if (tipo.equalsIgnoreCase("dinamica")){
            return new PilhaLista<Disco>();
        } else if (tipo.equalsIgnoreCase("contigua")){
            return new PilhaVetor<Disco>();
        }
        return new PilhaLista<Disco>();
    }
}

