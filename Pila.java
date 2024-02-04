package pilas1;

public class Pila<T> {
    private Nodo<T> cima = null;
    public void push(T elemento) {
        cima = new Nodo<>(elemento, cima);
    }
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        T elemento = cima.elemento;
        cima = cima.siguiente;
        return elemento;
    }
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        return cima.elemento;
    }
    public boolean isEmpty() {
        return cima == null;
    }   


    public class Nodo<T> {
        T elemento;
        Nodo<T> siguiente;

        public Nodo(T elemento, Nodo<T> siguiente) {
            this.elemento = elemento;
            this.siguiente = siguiente;
        }
    }
        
}




