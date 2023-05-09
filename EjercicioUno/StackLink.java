


package EjercicioUno;
import actividad1.ExceptionIsEmpty;
import actividad1.Stack;
public class StackLink<E> implements Stack<E> {
    private Node<E> top;
    public StackLink() {
        this.top = null;
    }
    public void push(E x) {
        Node<E> newNode = new Node<>(x);
        newNode.setNext(top);
        top = newNode;
    }
    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La pila esta vacia. No se puede extraer ningun elemento.");
        } else {
            E elemento = top.getData();
            top = top.getNext();
            return elemento;
        }
    }
    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La pila esta vacia. No se puede obtener el elemento superior.");
        } else {
            return top.getData();
        }
    }
    public boolean isEmpty() {
        return top == null;
    }
}
