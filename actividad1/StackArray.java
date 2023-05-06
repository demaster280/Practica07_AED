

package actividad1;
class StackArray<E> implements Stack<E> {
    private E[] array;
    private int tope;
    public StackArray(int n) {
        this.array = (E[]) new Object[n];
        tope = -1;
    }
    // Agrega un elemento a la pila
    public void push(E x) {
        if (isFull()) {
            System.out.println("La pila esta llena. No se puede agregar el elemento.");
        } else {
            tope++;
            array[tope] = x;
        }
    }
    // Elimina y devuelve el elemento superior de la pila
    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La pila está vacia. No se puede extraer ningún elemento.");
        } else {
            E elemento = array[tope];
            array[tope] = null; // Liberar la referencia al elemento eliminado
            tope--;
            return elemento;
        }
    }

    
    
    
    
    
    // Devuelve el elemento superior de la pila sin eliminarlo
    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La pila esta vacia. No se puede obtener el elemento superior.");
        } else {
            return array[tope];
        }
    }

    // Verifica si la pila está vacía
    public boolean isEmpty() {
        return tope == -1;
    }

    // Verifica si la pila está llena
    public boolean isFull() {
        return tope == array.length - 1;
    }

    // Devuelve una representación en cadena de la pila
    public String toString() {
        if (isEmpty()) {
            return "La pila esta vacia.";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = tope; i >= 0; i--) {
                sb.append(array[i]).append(" ");
            }
            return sb.toString();
        }
    }
}
