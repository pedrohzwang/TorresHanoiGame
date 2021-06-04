package estruturas;

import java.util.Arrays;

public class PilhaLista<T> implements Pilha<T>{

    private No ultima;
    private No primeiro;
    private int contador;

    public PilhaLista() {
        this.contador = 0;
    }

    @Override
    public void push(T obj) throws Exception {
        No novoNo = new No(obj, null);
        if (this.vazia()){
            this.primeiro = novoNo;
            this.ultima = novoNo;
            this.primeiro.setNext(ultima);
        } else{
            this.ultima.setNext(novoNo);
            this.ultima = novoNo;
        }
        contador++;
    }

    @Override
    public T pop() throws Exception{
        No no = null;
        for (int i = 0; i < (contador - 1); i++){
            if (i == 0){
                no = this.primeiro;
            } else{
                no = no.getNext();
            }
        }
        T old = this.top();
        contador--;
        if (no != null & contador > 0){
            this.ultima = no;
            no.setNext(null);
        } else{
            this.libera();
        }
        return old;
    }

    @Override
    public T top() {
        if (this.ultima == null){
            return null;
        }
        return (T) this.ultima.getInfo();
    }

    @Override
    public boolean vazia() {
        return contador == 0;
    }

    @Override
    public void libera() {
        this.primeiro = null;
        this.ultima = null;
        contador = 0;
    }

    @Override
    public String toString() {
        T retorno[] = (T[]) new Object[contador];
        No no = null;
        for (int i = 0; i < contador; i++){
            if (i == 0){
                no = this.primeiro;
            } else if(no.getNext() != null){
                no = no.getNext();
            }
            retorno[i] = (T) no.getInfo();
        }
        return Arrays.toString(retorno);
    }
}
