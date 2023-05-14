


package ejercicio4;
import actividad1.ExceptionIsEmpty;
public class Test {
    public static void main(String[] args) {
        Polaca polaca = new Polaca();
        try {
            // Prueba con archivo 1
            System.out.println("Archivo 1:");
            polaca.readFile("archivo1.txt");
            System.out.println();

            // Prueba con archivo 2
            System.out.println("Archivo 2:");
            polaca.readFile("archivo2.txt");
            System.out.println();

            // Prueba con archivo 3
            System.out.println("Archivo 3:");
            polaca.readFile("archivo3.txt");
            System.out.println();
        } catch (ExceptionIsEmpty e) {
            e.printStackTrace();
        }
    }
}


