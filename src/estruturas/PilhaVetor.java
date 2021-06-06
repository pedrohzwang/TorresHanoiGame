package estruturas;

import java.util.Arrays;

public class PilhaVetor<T> implements Pilha<T>{

    private T vet[];
    private int contador;

    public PilhaVetor() {
        this.contador = 0;
        this.vet = (T[])new Object[10];
    }

    public PilhaVetor(PilhaVetor<T> original) {
        this.contador = original.contador;
        this.vet = original.vet;
    }

    @Override
    public void push(T obj) throws Exception {
        vet[contador] = obj;
        contador++;

        if (vet.length == contador) {
            resizeArray();
        }
    }

    @Override
    public T pop() throws Exception {
        T old = this.top();
        if (contador > 0){
            this.vet[contador - 1] = null;
            contador--;
        } else {
            this.libera();
        }
        return old;
    }

    @Override
    public T top() throws Exception {
        if (this.contador == 0){
            return null;
        }
        return vet[contador - 1];
    }

    @Override
    public boolean vazia() {
        return contador == 0;
    }

    @Override
    public void libera() {
        this.vet = (T[]) new Object[vet.length];
        this.contador = 0;
    }

    private void resizeArray(){
        T newArray[] = (T[]) new Object[this.vet.length + 1];
        System.arraycopy(this.vet, 0, newArray, 0, this.vet.length);
        this.vet = newArray;
    }

    @Override
    public String toString() {
        T strArray[] = (T[]) new Object[contador];
        System.arraycopy(this.vet, 0, strArray, 0, contador);
        return Arrays.toString(strArray);
    }
}
