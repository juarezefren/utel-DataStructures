/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploarraylist;

import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        
        // Agregar elementos
        listaNumeros.add(45);
        listaNumeros.add(32);
        listaNumeros.add(12);
        listaNumeros.add(56);
        listaNumeros.add(27);

        // Imprimir la lista
        System.out.println("Lista con elementos agregados:");
        imprimirLista(listaNumeros);

        // Eliminar un elemento
        listaNumeros.remove(2); // Elimina el elemento en la posición 2 (tercer elemento)

        // Imprimir la lista después de eliminar
        System.out.println("Lista después de eliminar un elemento:");
        imprimirLista(listaNumeros);

        // Verificar si la lista está vacía
        System.out.println("¿Está vacía la lista? " + listaNumeros.isEmpty());

        // Obtener el tamaño de la lista
        System.out.println("Tamaño de la lista: " + listaNumeros.size());
    }

    private static void imprimirLista(ArrayList<Integer> lista) {
        for (int num : lista) {
            System.out.println(num);
        }
    }
}

