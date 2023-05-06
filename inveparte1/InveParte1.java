
package inveparte1;
import java.util.Deque;
import java.util.LinkedList;
public class InveParte1 {
    public static void main(String[] args) {
        // Crear una bicola vacía
        Deque<Integer> deque = new LinkedList<Integer>();
        // Agregar elementos al frente
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        System.out.println(deque); // Retorna: [3, 2, 1]
        // Agregar elementos al final
        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(6);
        System.out.println(deque); // Retorna: [3, 2, 1, 4, 5, 6]
        // Obtener el primer elemento y eliminarlo
        int first = deque.removeFirst();
        System.out.println(first); // 3
        System.out.println(deque); // Retornaa: [2, 1, 4, 5, 6]
        // Obtener el último elemento y eliminarlo
        int last = deque.removeLast();
        System.out.println(last); // 6
        System.out.println(deque); // Retorna: [2, 1, 4, 5]
        // Obtener el primer elemento sin eliminarlo
        int peekFirst = deque.peekFirst();
        System.out.println(peekFirst); // 2
        System.out.println(deque); // Retorna: [2, 1, 4, 5]
        // Obtener el último elemento sin eliminarlo
        int peekLast = deque.peekLast();
        System.out.println(peekLast); // 5
        System.out.println(deque); // Retornaa: [2, 1, 4, 5]
    }
}

