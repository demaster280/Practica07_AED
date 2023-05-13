

package actividad3;
public class Test {
    public static void main(String[] args) {
        
        // Crear una cola de prioridad de tipo String
        PriorityQueue<String, Integer> stringPriorityQueue = new PriorityQueueLinked<>(3);
        stringPriorityQueue.enqueue("PruebaUno", 2);
        stringPriorityQueue.enqueue("PruebaDos", 1);
        stringPriorityQueue.enqueue("PruebaTres", 3);

        try {
            System.out.println("Front: " + stringPriorityQueue.front()); 
            System.out.println("Back: " + stringPriorityQueue.back()); 

            while (!stringPriorityQueue.isEmpty()) {
                String element = stringPriorityQueue.dequeue();
                System.out.println("Dequeued: " + element);
            }
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        
        
        // Crear una cola de prioridad de tipo Integer
        PriorityQueue<Integer, Integer> intPriorityQueue = new PriorityQueueLinked<>(5);
        intPriorityQueue.enqueue(5, 3);
        intPriorityQueue.enqueue(10, 1);
        intPriorityQueue.enqueue(2, 2);
        try {
            System.out.println("Front: " + intPriorityQueue.front()); // Debería mostrar 10
            System.out.println("Back: " + intPriorityQueue.back()); // Debería mostrar 5

            while (!intPriorityQueue.isEmpty()) {
                int element = intPriorityQueue.dequeue();
                System.out.println("Dequeued: " + element);
            }
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }
}

