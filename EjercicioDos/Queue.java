

package EjercicioDos;
public interface Queue<E> { 
    void enqueue(E x);
    E dequeue() throws actividad1.ExceptionIsEmpty;
    E front() throws actividad1.ExceptionIsEmpty;
    E back() throws actividad1.ExceptionIsEmpty;
    boolean isEmpty();
} 


