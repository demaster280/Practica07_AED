



package EjercicioTres;
import java.util.ArrayList;
import java.util.List;
public class PriorityQueueLinked<E, P> implements PriorityQueue<E, P> {
    private List<Queue<E>> colas; // Lista de colas para cada prioridad
    public PriorityQueueLinked(int numPrioridades) {
        colas = new ArrayList<>(numPrioridades);
        for (int i = 0; i < numPrioridades; i++) {
            colas.add(new Queue<>());
        }
    }
    public void enqueue(E elemento, P prioridad) {
        int indicePrioridad = obtenerIndicePrioridad(prioridad);
        colas.get(indicePrioridad).enqueue(elemento);
    }
    public E dequeue() throws ExcepcionColaVacia {
        for (Queue<E> cola : colas) {
            if (!cola.isEmpty()) {
                return cola.dequeue();
            }
        }
        throw new ExcepcionColaVacia("No se puede desencolar de una cola vacia");
    }      
    public E front() throws ExcepcionColaVacia {
        for (Queue<E> cola : colas) {
            if (!cola.isEmpty()) {
                return cola.front();
            }
        }
        throw new ExcepcionColaVacia("La cola esta vacia");
    }
    
    
    
    
    public E back() throws ExcepcionColaVacia {
        for (int i = colas.size() - 1; i >= 0; i--) {
            if (!colas.get(i).isEmpty()) {
                return colas.get(i).back();
            }
        }
        throw new ExcepcionColaVacia("La cola esta vacia");
    }
    public boolean isEmpty() {
        for (Queue<E> cola : colas) {
            if (!cola.isEmpty()) {
                return false;
            }
        }
        return true;
    }
    private int obtenerIndicePrioridad(P prioridad) {
        if (prioridad instanceof Integer) {
            return (int) prioridad;
        } else {
            throw new IllegalArgumentException("Tipo de prioridad no soportado: " + prioridad.getClass().getName());
        }
    }
}



