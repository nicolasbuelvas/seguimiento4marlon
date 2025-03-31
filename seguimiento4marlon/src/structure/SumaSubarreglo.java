package structure;

public class SumaSubarreglo {

    public int[] encontrarSubarreglo(int[] arr, int S) {
        TablaHash<Integer, Integer> hash = new TablaHash<>();
        int sumaAcumulada = 0;

        for (int i = 0; i < arr.length; i++) {
            sumaAcumulada += arr[i];

            if (sumaAcumulada == S) {
                return new int[]{0, i};
            }

            Integer indiceAnterior = hash.obtener(sumaAcumulada - S);
            if (indiceAnterior != null) {
                return new int[]{indiceAnterior + 1, i};
            }

            hash.insertar(sumaAcumulada, i);
        }

        return new int[]{-1, -1};
    }
}