

package ejercicio4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import EjercicioUno.StackLink;
import actividad1.ExceptionIsEmpty;

public class Polaca {
    public void readFile(String ruta) throws ExceptionIsEmpty {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String line;
            while ((line = br.readLine()) != null) {
                String postfixExpression = inToPos(line);
                int result = resultExpresion(postfixExpression);
                System.out.println("Expresion infija: " + line);
                System.out.println("Expresion postfija: " + postfixExpression);
                System.out.println("Resultado: " + result);
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Convierte una expresión infija a una expresión posfija utilizando una pila
    private String inToPos(String expression) throws ExceptionIsEmpty {
        StringBuilder postfix = new StringBuilder();
        StackLink<Character> stack = new StackLink<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch); // Agregar operandos directamente al resultado posfijo
            } else if (ch == '(') {
                stack.push(ch); // Apilar paréntesis de apertura
            } else if (ch == ')') {
                // Desapilar y agregar a la salida todos los operadores en la pila hasta encontrar el paréntesis de apertura
                while (!stack.isEmpty() && stack.top() != '(') {
                    postfix.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.top() != '(') {
                    throw new IllegalArgumentException("Expresion invalida: parentesis desbalanceados");
                }
                stack.pop(); // Eliminar '(' de la pila
            } else {
                // Desapilar y agregar a la salida todos los operadores con mayor o igual precedencia que el operador actual
                while (!stack.isEmpty() && getPrecedence(ch) <= getPrecedence(stack.top())) {
                    postfix.append(stack.pop());
                }
                stack.push(ch); // Apilar el operador actual
            }
        }
        // Desapilar y agregar a la salida todos los operadores restantes en la pila
        while (!stack.isEmpty()) {
            if (stack.top() == '(') {
                throw new IllegalArgumentException("Expresion invalida: parentesis desbalanceados");
            }
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

// Evalúa una expresión posfija utilizando una pila y devuelve el resultado
    private int resultExpresion(String expression) throws ExceptionIsEmpty {
        StackLink<Integer> stack = new StackLink<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // Convertir dígitos a enteros y apilar operandos
            } else {
                int operand2 = stack.pop(); // Desapilar operandos
                int operand1 = stack.pop();
                // Realizar la operación correspondiente según el operador
                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                    case 'S':
                        stack.push((int) Math.pow(operand1, operand2));
                        break;
                }
            }
        }
        return stack.pop();
    }       
    // Obtiene la precedencia de un operador
    private int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case 'S':
                return 3;
        }
        return -1; // Valor por defecto en caso de operador inválido
    }
}
