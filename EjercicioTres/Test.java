


package EjercicioTres;
public class Test {
    public static void main(String[] args) {
        // Crear una cola de prioridad con 3 prioridades
        PriorityQueue<String, Integer> colaPrioridad = new PriorityQueueLinked<>(3);
        // Encolar elementos con diferentes prioridades
        colaPrioridad.enqueue("Elemento A", 2);
        colaPrioridad.enqueue("Elemento B", 1);
        colaPrioridad.enqueue("Elemento C", 3);
        colaPrioridad.enqueue("Elemento D", 1);
        colaPrioridad.enqueue("Elemento E", 2);
        // Verificar el contenido de la cola
        System.out.println("Contenido de la cola: " + colaPrioridad.toString());
        // Desencolar elementos y mostrarlos
        try {
            System.out.println("Desencolando: " + colaPrioridad.dequeue());
            System.out.println("Desencolando: " + colaPrioridad.dequeue());
            System.out.println("Desencolando: " + colaPrioridad.dequeue());
        } catch (ExcepcionColaVacia e) {
            System.out.println("Error al desencolar: " + e.getMessage());
        }
        
        
        
        // Verificar el contenido de la cola después de desencolar
        System.out.println("Contenido de la cola despues de desencolar: " + colaPrioridad.toString());
        // Obtener el elemento en el frente de la cola
        try {
            String elementoFrontal = colaPrioridad.front();
            System.out.println("Elemento frontal de la cola: " + elementoFrontal);
        } catch (ExcepcionColaVacia e) {
            System.out.println("Error al obtener el elemento frontal: " + e.getMessage());
        }
        // Obtener el elemento en la parte posterior de la cola
        try {
            String elementoPosterior = colaPrioridad.back();
            System.out.println("Elemento posterior de la cola: " + elementoPosterior);
        } catch (ExcepcionColaVacia e) {
            System.out.println("Error al obtener el elemento posterior: " + e.getMessage());
        }
        // Verificar si la cola está vacía
        boolean vacia = colaPrioridad.isEmpty();
        System.out.println("¿La cola esta vacia? " + vacia);
    }
}
