package structure;

public class ListaEnlazada {
    private Nodo head;

    public ListaEnlazada() {
        head = null;
    }

    public void agregar(int key, int value) {
        Nodo nuevo = new Nodo(key, value);
        nuevo.next = head;
        head = nuevo;
    }

    public Integer obtenerValor(int key) {
        Nodo actual = head;
        while (actual != null) {
            if (actual.key == key) {
                return actual.value;
            }
            actual = actual.next;
        }
        return null;
    }
}