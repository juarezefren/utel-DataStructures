
package ejemplobst;

public class ArbolBinarioDeBusqueda {
    Nodo raiz;

    public ArbolBinarioDeBusqueda() {
        raiz = null;
    }

    // Insertar un nuevo valor en el árbol
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor, null);
    }

    // Método auxiliar recursivo para insertar un nuevo nodo
    private Nodo insertarRec(Nodo actual, int valor, Nodo padre) {
        if (actual == null) {
            return new Nodo(valor, padre);
        }
        if (valor < actual.valor) {
            actual.izquierdo = insertarRec(actual.izquierdo, valor, actual);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRec(actual.derecho, valor, actual);
        }
        return actual;
    }

    // Buscar un valor en el árbol
    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    // Método auxiliar recursivo para buscar un valor
    private boolean buscarRec(Nodo actual, int valor) {
        if (actual == null) {
            return false;
        }
        if (valor == actual.valor) {
            return true;
        }
        return valor < actual.valor
            ? buscarRec(actual.izquierdo, valor)
            : buscarRec(actual.derecho, valor);
    }
    
    // Recorrido Inorden del árbol
    public void inOrden() {
        inOrdenRec(raiz);
    }

    // Método auxiliar recursivo para el recorrido Inorden
    private void inOrdenRec(Nodo actual) {
        if (actual != null) {
            inOrdenRec(actual.izquierdo);
            System.out.print(actual.valor + ", ");
            inOrdenRec(actual.derecho);
        }
    }
       
    // Método toString para obtener una representación en cadena del árbol
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        inOrdenToString(raiz, sb);
        // Elimina la última coma y espacio para una presentación más limpia
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }

    // Método auxiliar recursivo para el recorrido inorden y construcción del String
    private void inOrdenToString(Nodo actual, StringBuilder sb) {
        if (actual != null) {
            inOrdenToString(actual.izquierdo, sb);
            sb.append(actual.valor).append(", ");
            inOrdenToString(actual.derecho, sb);
        }
    }
    
    // Método público que inicia el recorrido Preorden
    public void preOrden() {
        preOrdenRec(raiz);
    }

    // Método auxiliar recursivo para el recorrido Preorden
    private void preOrdenRec(Nodo actual) {
        if (actual != null) {
            System.out.print(actual.valor + ", ");
            preOrdenRec(actual.izquierdo);
            preOrdenRec(actual.derecho);
        }
    }

    // Método público que inicia el recorrido Postorden
    public void postOrden() {
        postOrdenRec(raiz);
    }

    // Método auxiliar recursivo para el recorrido Postorden
    private void postOrdenRec(Nodo actual) {
        if (actual != null) {
            postOrdenRec(actual.izquierdo);
            postOrdenRec(actual.derecho);
            System.out.print(actual.valor + ", ");
        }
    }
   
    // Método para eliminar un valor del árbol
    public void eliminar(int valor) {
        raiz = eliminarRec(raiz, valor);
    }

    // Método auxiliar recursivo para eliminar un nodo
    private Nodo eliminarRec(Nodo actual, int valor) {
        if (actual == null) {
            return actual;
        }
        // Navegar por el árbol
        if (valor < actual.valor) {
            actual.izquierdo = eliminarRec(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = eliminarRec(actual.derecho, valor);
        }
        // Nodo encontrado
        else {
            // Nodo con un hijo o sin hijos
            if (actual.izquierdo == null) {
                return actual.derecho;
            } else if (actual.derecho == null) {
                return actual.izquierdo;
            }
            // Nodo con dos hijos: Obtener el sucesor inorden 
            //(el menor en el subárbol derecho)
            actual.valor = valorMinimo(actual.derecho);
            // Eliminar el sucesor inorden
            actual.derecho = eliminarRec(actual.derecho, actual.valor);
        }
        return actual;
    }

    // Método para encontrar el valor mínimo (sucesor inorden)
    private int valorMinimo(Nodo raiz) {
        int valorMin = raiz.valor;
        while (raiz.izquierdo != null) {
            valorMin = raiz.izquierdo.valor;
            raiz = raiz.izquierdo;
        }
        return valorMin;
    }
    
    class Nodo {
        int valor;
        Nodo izquierdo, derecho;
        Nodo padre;

        public Nodo(int valor) {
            this.valor = valor;
            this.izquierdo = this.derecho = null;
        }

        public Nodo(int valor, Nodo padre) {
            this.valor = valor;
            this.padre=padre;
            this.izquierdo = this.derecho = null;
        }
    }
 
}
