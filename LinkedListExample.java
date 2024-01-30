package linkedlistexample;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Crear una lista
        LinkedList<String> miLista = new LinkedList<>();

        // Añadir elementos al final de la lista
        miLista.add("Elemento 1");
        miLista.add("Elemento 3");

        // Añadir un elemento al inicio de la lista
        miLista.addFirst("Elemento 0");

        // Insertar un elemento en una posición específica
        miLista.add(2, "Elemento 2"); // Inserta en la posición 2

        // Añadir un elemento al final de la lista
        miLista.addLast("Elemento 4");

        // Acceder a elementos
        System.out.println("Primer elemento: " + miLista.getFirst());
        System.out.println("Último elemento: " + miLista.getLast());

        // Tamaño de la lista
        System.out.println("Tamaño de la lista: " + miLista.size());

        // Eliminar elementos
        miLista.removeFirst(); // Elimina el primer elemento
        miLista.removeLast(); // Elimina el último elemento
        miLista.remove(1); // Elimina el elemento en la posición 1

        // Recorrer la lista
        for (String elemento : miLista) {
            System.out.println(elemento);
        }
    }
}


