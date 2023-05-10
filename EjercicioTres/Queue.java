


package EjercicioTres;



class Queue<T> {
    private Node<T> front;
    private Node<T> back;

    public void enqueue(T elemento) {
        Node<T> newNode = new Node<>(elemento);
        if (isEmpty()) {
            front = newNode;
            back = newNode;
        } else {
            back.setNext(newNode);
            back = newNode;
        }
    }

    public T dequeue() throws ExcepcionColaVacia {
        if (isEmpty()) {
            throw new ExcepcionColaVacia("No se puede desencolar de una cola vacía");
        }
        T elemento = front.getData();
        front = front.getNext();
        if (front == null) {
            back = null;
        }
        return elemento;
    }

    public T front() throws ExcepcionColaVacia {
        if (isEmpty()) {
            throw new ExcepcionColaVacia("La cola está vacía");
        }
        return front.getData();
    }

    public T back() throws ExcepcionColaVacia {
        if (isEmpty()) {
            throw new ExcepcionColaVacia("La cola está vacía");
        }
        return back.getData();
    }

    public boolean isEmpty() {
        return front == null;
    }
}
