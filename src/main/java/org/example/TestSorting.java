package org.example;

public class TestSorting {
    public static void main(String[] args) {
        int[] numeros = LectorNumeros.leerNumeros("numeros.txt");

        medirTiempo("Insertion Sort", numeros, new InsertionSort());
        medirTiempo("Merge Sort", numeros, new MergeSort());
        medirTiempo("Quick Sort", numeros, new QuickSort());
        medirTiempo("Radix Sort", numeros, new RadixSort());
    }

    public static void medirTiempo(String nombre, int[] arr, Object algoritmo) {
        int[] copia = arr.clone();
        long inicio = System.nanoTime();

        if (algoritmo instanceof InsertionSort) {
            InsertionSort.sort(copia);
        } else if (algoritmo instanceof MergeSort) {
            MergeSort.sort(copia);
        } else if (algoritmo instanceof QuickSort) {
            QuickSort.sort(copia);
        } else if (algoritmo instanceof RadixSort) {
            RadixSort.sort(copia);
        }

        long fin = System.nanoTime();
        System.out.println(nombre + " tomó: " + (fin - inicio) / 1e6 + " ms");
    }
}