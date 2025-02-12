package org.example;

public class QuickSort {
    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indicePivote = particion(arr, izquierda, derecha);
            quickSort(arr, izquierda, indicePivote - 1);
            quickSort(arr, indicePivote + 1, derecha);
        }
    }

    private static int particion(int[] arr, int izquierda, int derecha) {
        int pivote = arr[derecha];
        int i = izquierda - 1;

        for (int j = izquierda; j < derecha; j++) {
            if (arr[j] < pivote) {
                i++;
                intercambiar(arr, i, j);
            }
        }

        intercambiar(arr, i + 1, derecha);
        return i + 1;
    }

    private static void intercambiar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}