

package EjercicioDos;
import actividad1.ExceptionIsEmpty;
public class QueueArray<E> implements Queue<E> {
    private final E[] array;
    private int size;
    private int first;
    private int last;
    public QueueArray(int capacity) {
        this.array = (E[]) new Object[capacity];
        this.size = 0;
        this.first = 0;
        this.last = -1;
    }
    public void enqueue(E x) {
        if (isFull()) {
            System.out.println("La cola esta llena. No se puede agregar el elemento.");
        } else {
            last = (last + 1) % array.length;
            array[last] = x;
            size++;
        }
    }
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola esta vacia. No se puede extraer ningun elemento.");
        } else {
            E element = array[first];
            array[first] = null;
            first = (first + 1) % array.length;
            size--;
            return element;
        }
    }
    
    
    
    
    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola esta vacia. No se puede obtener el elemento frontal.");
        } else {
            return array[first];
        }
    }       
    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola esta vacia. No se puede obtener el elemento posterior.");
        } else {
            return array[last];
        }
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == array.length;
    }
    public String toString() {
        if (isEmpty()) {
            return "La cola esta vacia.";
        } else {
            StringBuilder sb = new StringBuilder();
            int current = first;
            for (int i = 0; i < size; i++) {
                sb.append(array[current]).append(" ");
                current = (current + 1) % array.length;
            }
            return sb.toString();
        }
    }
}

