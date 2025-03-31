package ui;

import java.util.Scanner;
import model.Controller;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos del arreglo:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.nextLine();

        System.out.println("Ingrese la suma objetivo S:");
        int S = sc.nextInt();

        Controller controller = new Controller();
        String resultado = controller.encontrarSubarreglo(arr, S);
        System.out.println(resultado);

        sc.close();
    }
}