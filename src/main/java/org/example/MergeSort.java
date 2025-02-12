package org.example;

public class MergeSort {
    public static void sort(int[] arr) {
        if (arr.length <= 1) return;
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            mergeSort(arr, izquierda, medio);
            mergeSort(arr, medio + 1, derecha);
            merge(arr, izquierda, medio, derecha);
        }
    }

    private static void merge(int[] arr, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        int[] izquierdaArr = new int[n1];
        int[] derechaArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            izquierdaArr[i] = arr[izquierda + i];
        }
        for (int i = 0; i < n2; i++) {
            derechaArr[i] = arr[medio + 1 + i];
        }

        int i = 0, j = 0, k = izquierda;
        while (i < n1 && j < n2) {
            if (izquierdaArr[i] <= derechaArr[j]) {
                arr[k] = izquierdaArr[i];
                i++;
            } else {
                arr[k] = derechaArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = izquierdaArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = derechaArr[j];
            j++;
            k++;
        }
    }
}