
package EjercicioDos;
import actividad1.ExceptionIsEmpty;
public class Test {
    public static void main(String[] args) {
        // Crear objeto de tipo QueueArray
        Queue<Integer> queue = new QueueArray<>(5);
        try {
            // Agregar elementos a la cola
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);

            // Imprimir el frente y el final de la cola
            System.out.println("Frente de la cola: " + queue.front());
            System.out.println("Final de la cola: " + queue.back());

            // Eliminar un elemento de la cola
            int elementoEliminado = queue.dequeue();
            System.out.println("Elemento eliminado: " + elementoEliminado);

            // Verificar si la cola está vacía
            System.out.println("La cola esta vacia " + queue.isEmpty());

            // Imprimir la cola completa
            System.out.println("Contenido de la cola: " + queue.toString());
        } catch (ExceptionIsEmpty e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}



