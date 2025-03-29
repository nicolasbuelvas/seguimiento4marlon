package structure;

public class Nodo {
    public int key;
    public int value;
    public Nodo next;

    public Nodo(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}