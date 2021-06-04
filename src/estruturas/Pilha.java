package estruturas;

public interface Pilha<T> {

    public void push(T obj) throws Exception;
    public T pop() throws Exception;
    public T top() throws Exception;
    public boolean vazia();
    public void libera();
}
