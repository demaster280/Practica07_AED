


package actividad3;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class PriorityQueueLinked<E, P extends Comparable<P>> implements PriorityQueue<E, P> {
    private List<Queue<E>> queues;
    @SuppressWarnings("unchecked")
    public PriorityQueueLinked(int numPriorities) {
        queues = new ArrayList<>(numPriorities);
        for (int i = 0; i < numPriorities; i++) {
            queues.add(new LinkedList<>());
        }
    }
    public void enqueue(E x, P pr) {
        int priorityIndex = pr.compareTo(pr); // Suponemos que la prioridad es un valor numérico

        if (priorityIndex >= 0 && priorityIndex < queues.size()) {
            Queue<E> queue = queues.get(priorityIndex);
            queue.add(x);
        } else {
            throw new IllegalArgumentException("Valor de prioridad no valido");
        }
    }
    public E dequeue() throws ExceptionIsEmpty {
        for (int i = queues.size() - 1; i >= 0; i--) {
            Queue<E> queue = queues.get(i);
            if (!queue.isEmpty()) {
                return queue.remove();
            }
        }
        throw new ExceptionIsEmpty("No se puede eliminar de una cola vacia");
    }
    
  
    

    public E front() throws ExceptionIsEmpty {
        for (int i = queues.size() - 1; i >= 0; i--) {
            Queue<E> queue = queues.get(i);
            if (!queue.isEmpty()) {
                return queue.peek();
            }
        }
        throw new ExceptionIsEmpty("No puede ponerse al frente de una cola vacia");
    }    
    public E back() throws ExceptionIsEmpty {
        for (int i = 0; i < queues.size(); i++) {
            Queue<E> queue = queues.get(i);
            if (!queue.isEmpty()) {
                E lastElement = null;
                for (E element : queue) {
                    lastElement = element;
                }
                return lastElement;
            }
        }
        throw new ExceptionIsEmpty("No se puede volver a una cola vacia");
    }

    public boolean isEmpty() {
        for (Queue<E> queue : queues) {
            if (!queue.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}


j

