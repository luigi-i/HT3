package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeneradorNumeros {
    public static void main(String[] args) {
        String archivo = "numeros.txt";  // Nombre del archivo donde se guardarán los números
        int cantidadNumeros = 3000;  // Cantidad de números a generar
        Random random = new Random();

        try (FileWriter writer = new FileWriter(archivo)) {
            for (int i = 0; i < cantidadNumeros; i++) {
                int numero = random.nextInt(10000); // Números aleatorios entre 0 y 9999
                writer.write(numero + "\n");
            }
            System.out.println("Archivo generado exitosamente: " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}