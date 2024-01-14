
package com.mycompany.selectionsortexample;

import java.util.Random;

public class SelectionSortExample {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        Random random = new Random();

        // Asignar valores aleatorios al arreglo
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000); // Valores entre 0 y 9999
        }

        // Iniciar el cronómetro para medir el tiempo de ordenación
        long startTime = System.currentTimeMillis();

        // Ordenar el arreglo usando el algoritmo de selección
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambiar el elemento mínimo encontrado con el primer elemento no ordenado
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        // Detener el cronómetro y calcular el tiempo de ejecución
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        // Imprimir el tiempo de ordenación y los elementos del arreglo
        System.out.println("Tiempo de ordenación: " + duration + " milisegundos");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : "\n"));
        }
    }
}
