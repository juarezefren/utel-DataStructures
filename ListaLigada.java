package linkedlistexample;

public class ListaLigada {
    // Referencia al primer nodo de la lista
    private Nodo inicio;
    // Referencia al último nodo de la lista
    private Nodo fin;

    // Constructor para crear una lista ligada vacía
    public ListaLigada() {
        inicio = null;
        fin = null;
    }
    // Método para insertar un elemento al inicio de la lista
    public void insertarAlInicio(int dato) {
        // Crear un nuevo nodo que apunte al nodo actual inicio
        inicio = new Nodo(dato, inicio);
        // Si la lista estaba vacía, entonces fin también apunta al nuevo nodo
        if (fin == null) {
            fin = inicio;
        }
    }   
    
    // Método para insertar un elemento al final de la lista
    public void insertarAlFinal(int dato) {
        // Crear un nuevo nodo con el dato
        Nodo nuevoNodo = new Nodo(dato);
        // Si la lista está vacía, inicio y fin apuntarán al nuevo nodo
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            // Si la lista no está vacía, el nodo actual fin apunta al nuevo nodo
            fin.siguiente = nuevoNodo;
        }
        // El nuevo nodo es ahora el fin de la lista
        fin = nuevoNodo;
    }
    
    // Método para eliminar el elemento al inicio de la lista
    public void eliminaInicio() {
        // Verificar si la lista no está vacía
        if (inicio != null) {
            // Actualizar inicio para que apunte al segundo nodo
            inicio = inicio.siguiente;
            // Si el inicio es null, entonces la lista está ahora vacía y fin 
            //también debe ser null
            if (inicio == null) {
                fin = null;
            }
        }
    }

    // Método para eliminar el elemento al final de la lista
    public void eliminaFinal() {
        // Verificar si la lista no está vacía
        if (inicio != null) {
            // Si inicio y fin son iguales, la lista solo tiene un nodo
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                // Comenzar desde el inicio de la lista
                Nodo actual = inicio;
                // Continuar hasta el penúltimo nodo
                while (actual.siguiente != fin) {
                    actual = actual.siguiente;
                }
                // Actualizar el siguiente del penúltimo nodo a null
                actual.siguiente = null;
                // Actualizar fin para que apunte al penúltimo nodo
                fin = actual;
            }
        }
    }
    
    // Método para recorrer la lista y mostrar sus elementos
    public void recorrerLista() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
    
    // Método para buscar un elemento en la lista
    public boolean buscar(int valor) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.dato == valor) {
                return true; // Valor encontrado
            }
            actual = actual.siguiente;
        }
        return false; // Valor no encontrado
    }
    
    
    public class Nodo {
        // Variable para almacenar el dato del nodo
        int dato;
        // Referencia al siguiente nodo en la lista
        Nodo siguiente;
        // Referencia al siguiente nodo en la lista
        Nodo anterior;

        // Constructor para crear un nuevo nodo con un dato y sin un siguiente nodo
        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null; // Por defecto, el siguiente nodo es null
            this.anterior = null; // Por defecto, el anterior nodo es null
        }

        // Constructor para crear un nuevo nodo con un dato y un siguiente nodo
        public Nodo(int dato, Nodo siguiente) {
            this.dato = dato;
            this.siguiente = siguiente;
            this.anterior = null; // Por defecto, el anterior nodo es null
        }  
    }
    
}
