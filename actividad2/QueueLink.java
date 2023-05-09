
package actividad2;
import actividad1.ExceptionIsEmpty;
class QueueLink<E> implements Queue<E> {
    private Node<E> first;
    private Node<E> last;
    public QueueLink() {
        this.first = null;
        this.last = null;
    }
    public void enqueue(E x) {
        Node<E> aux = new Node<E>(x);
        if (isEmpty()) {
            this.first = aux;
        } else {
            this.last.setNext(aux);
        }
        this.last = aux;
    }
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía. No se puede eliminar ningún elemento.");
        } else {
            E elemento = this.first.getElement();
            this.first = this.first.getNext();
            if (this.first == null) {
                this.last = null;
            }
            return elemento;
        }
    }
    
    
    
    
    
    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía. No se puede obtener el último elemento.");
        } else {
            return this.last.getElement();
        }
    }

    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía. No se puede obtener el primer elemento.");
        } else {
            return this.first.getElement();
        }
    }
    public boolean isEmpty() {
        return this.first == null;
    }
    public String toString() {
        if (isEmpty()) {
            return "La cola está vacía.";
        } else {
            StringBuilder sb = new StringBuilder();
            Node<E> current = this.first;
            while (current != null) {
                sb.append(current.getElement()).append(" ");
                current = current.getNext();
            }
            return sb.toString();
        }
    }
}
