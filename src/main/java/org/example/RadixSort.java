package org.example;

import java.util.Arrays;

public class RadixSort {
    public static void sort(int[] arr) {
        int max = obtenerMaximo(arr);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    private static int obtenerMaximo(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] salida = new int[n];
        int[] conteo = new int[10];

        Arrays.fill(conteo, 0);

        for (int i = 0; i < n; i++) {
            conteo[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            conteo[i] += conteo[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            salida[conteo[(arr[i] / exp) % 10] - 1] = arr[i];
            conteo[(arr[i] / exp) % 10]--;
        }

        System.arraycopy(salida, 0, arr, 0, n);
    }
}