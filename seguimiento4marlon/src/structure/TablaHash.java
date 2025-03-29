package structure;

public class TablaHash {
    private ListaEnlazada[] tabla;
    private int capacidad;

    public TablaHash(int capacidad) {
        this.capacidad = capacidad;
        tabla = new ListaEnlazada[capacidad];
        for (int i = 0; i < capacidad; i++) {
            tabla[i] = new ListaEnlazada();
        }
    }

    private int hash(int key) {
        return Math.abs(key) % capacidad;
    }

    public void put(int key, int value) {
        int indice = hash(key);
        tabla[indice].agregar(key, value);
    }

    public Integer get(int key) {
        int indice = hash(key);
        return tabla[indice].obtenerValor(key);
    }
}
