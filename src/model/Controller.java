package model;

import structure.SumaSubarreglo;

public class Controller {

    public String encontrarSubarreglo(int[] arr, int S) {
        SumaSubarreglo sumaSubarreglo = new SumaSubarreglo();
        int[] indices = sumaSubarreglo.encontrarSubarreglo(arr, S);

        if (indices[0] == -1) {
            return "No se encontró un subarreglo con la suma " + S;
        } else {
            return "Subarreglo encontrado: (" + indices[0] + ", " + indices[1] + ")";
        }
    }
}