

package actividad1;
public class Test {
    public static void main(String[] args) {
        
        // Crear una instancia de StackArray para enteros
        Stack<Integer> stackInt = new StackArray<>(5);
        // Agregar elementos a la pila de enteros
        stackInt.push(10);
        stackInt.push(20);
        stackInt.push(30);
        stackInt.push(40);
        stackInt.push(50);

        // Obtener el elemento superior de la pila de enteros
        try {
            int topInt = stackInt.top();
            System.out.println("Elemento superior de la pila de enteros: " + topInt);
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        // Eliminar elementos de la pila de enteros
        try {
            int popInt1 = stackInt.pop();
            int popInt2 = stackInt.pop();
            System.out.println("Elementos eliminados de la pila de enteros: " + popInt1 + ", " + popInt2);
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        // Verificar si la pila de enteros está vacía
        System.out.println("La pila de enteros esta vacia: " + stackInt.isEmpty());

        // Crear una instancia de StackArray para cadenas de texto
        Stack<String> stackString = new StackArray<>(3);

        // Agregar elementos a la pila de cadenas de texto
        stackString.push("Hola");
        stackString.push("Mundo");

        // Obtener el elemento superior de la pila de cadenas de texto
        try {
            String topString = stackString.top();
            System.out.println("Elemento superior de la pila de cadenas de texto: " + topString);
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        // Verificar si la pila de cadenas de texto está vacía
        System.out.println("La pila de cadenas de texto esta vacia: " + stackString.isEmpty());
    }
}
