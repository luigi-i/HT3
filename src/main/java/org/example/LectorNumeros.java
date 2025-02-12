package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LectorNumeros {
    public static int[] leerNumeros(String archivo) {
        List<Integer> listaNumeros = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                listaNumeros.add(Integer.parseInt(linea.trim()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convertir la lista a un array
        return listaNumeros.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        String archivo = "numeros.txt";
        int[] numeros = leerNumeros(archivo);

        System.out.println("Primeros 10 números leídos:");
        for (int i = 0; i < Math.min(10, numeros.length); i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}