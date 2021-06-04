package estruturas;

public class No<T> {

    private T info;
    private No<T> next;

    public No() {
        this(null, null);
    }

    public No(T info, No<T> next) {
        this.info = info;
        this.next = next;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public No<T> getNext() {
        return next;
    }

    public void setNext(No<T> next) {
        this.next = next;
    }

}
