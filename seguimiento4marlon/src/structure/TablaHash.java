package structure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TablaHash<K, V> {
    private static final int CAPACIDAD_INICIAL = 16;
    private final List<LinkedList<Entrada<K, V>>> cubetas;
    private int size;

    public TablaHash() {
        cubetas = new ArrayList<>(CAPACIDAD_INICIAL);
        for (int i = 0; i < CAPACIDAD_INICIAL; i++) {
            cubetas.add(null);
        }
        size = 0;
    }

    public void insertar(K clave, V valor) {
        int indice = obtenerIndice(clave);
        LinkedList<Entrada<K, V>> cubeta = cubetas.get(indice);
        if (cubeta == null) {
            cubeta = new LinkedList<>();
            cubetas.set(indice, cubeta);
        }
        for (Entrada<K, V> entrada : cubeta) {
            if (entrada.clave.equals(clave)) {
                entrada.valor = valor;
                return;
            }
        }
        cubeta.add(new Entrada<>(clave, valor));
        size++;
    }

    public V obtener(K clave) {
        int indice = obtenerIndice(clave);
        LinkedList<Entrada<K, V>> cubeta = cubetas.get(indice);
        if (cubeta != null) {
            for (Entrada<K, V> entrada : cubeta) {
                if (entrada.clave.equals(clave)) {
                    return entrada.valor;
                }
            }
        }
        return null;
    }

    private int obtenerIndice(K clave) {
        return Math.abs(clave.hashCode() % cubetas.size());
    }

    private static class Entrada<K, V> {
        K clave;
        V valor;

        Entrada(K clave, V valor) {
            this.clave = clave;
            this.valor = valor;
        }
    }
}