/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizrotacion;

/**
 *
 * @author juare
 */
public class MatrizRotacion {

    public static void main(String[] args) {
        int[][] original = {
            {7,12,9,21}, 
            {8,5,48,6,1},
            {13,4,37,27}
        };
        
        int[][] rotada = rotarMatriz90Grados(original);

        System.out.println("Matriz Original:");
        imprimirMatriz(original);
        
        System.out.println("Matriz Rotada:");
        imprimirMatriz(rotada);
        
        
    }
    
    public static int[][] rotarMatriz90Grados(int[][] matriz) {
    int filas = matriz.length;
    int columnas = matriz[0].length;
    int[][] rotada = new int[columnas][filas];

    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            rotada[j][filas - 1 - i] = matriz[i][j];
        }
    }
    return rotada;
}

public static void imprimirMatriz(int[][] matriz) {
    for (int[] fila : matriz) {
        for (int elemento : fila) {
            System.out.print(elemento + "\t");
        }
        System.out.println();
    }
}
    
    
}
