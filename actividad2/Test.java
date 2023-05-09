

package actividad2;
import actividad1.ExceptionIsEmpty;
public class Test {
    public static void main(String[] args) {
        Queue<String> queueString = new QueueLink<>();
        // Prueba con datos de tipo String
        System.out.println("Prueba con datos de tipo String");
        try {
            queueString.enqueue("Hola");
            queueString.enqueue("Mundo");
            queueString.enqueue("!");

            System.out.println("Frente de la cola: " + queueString.front());
            System.out.println("Ultimo de la cola: " + queueString.back());
            System.out.println("Cola completa: " + queueString);

            System.out.println("Elemento removido: " + queueString.dequeue());
            System.out.println("Frente de la cola despues de eliminar: " + queueString.front());
            System.out.println("Cola despues de eliminar: " + queueString);
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }          
        System.out.println();
        Queue<Integer> queueInteger = new QueueLink<>();
        // Prueba con datos de tipo Integer
        System.out.println("Prueba con datos de tipo Integer");
        try {
            queueInteger.enqueue(10);
            queueInteger.enqueue(20);
            queueInteger.enqueue(30);
            System.out.println("Frente de la cola: " + queueInteger.front());
            System.out.println("Ultimo de la cola: " + queueInteger.back());
            System.out.println("Cola completa: " + queueInteger);
            System.out.println("Elemento removido: " + queueInteger.dequeue());
            System.out.println("Frente de la cola despues de eliminar: " + queueInteger.front());
            System.out.println("Cola despues de eliminar: " + queueInteger);
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }
}
