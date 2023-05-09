



package EjercicioUno;
import actividad1.Stack;
public class Test {
    public static void main(String[] args) {
    Stack<String> stack = new StackLink<>();
        // Agregar elementos a la pila
        stack.push("Elemento 1");
        stack.push("Elemento 2");
        stack.push("Elemento 3");
        try {
            // Obtener el elemento superior de la pila
            String topElement = stack.top();
            System.out.println("Elemento superior de la pila: " + topElement);

            // Extraer elementos de la pila
            String element1 = stack.pop();
            String element2 = stack.pop();

            System.out.println("Elemento extraido de la pila: " + element1);
            System.out.println("Elemento extraido de la pila: " + element2);

            // Verificar si la pila está vacía
            boolean empty = stack.isEmpty();
            System.out.println("la pila esta vacia" + empty);
        } catch (actividad1.ExceptionIsEmpty e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
        
    }
}



