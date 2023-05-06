package inveparte2;
import java.util.NoSuchElementException;
public class InveParte2<E> {
    private E[] array;
    private int head;
    private int tail;
    private int size;    
    public InveParte2(int capacity) {
        this.array = (E[]) new Object[capacity];
        this.head = capacity / 2;
        this.tail = head;
        this.size = 0;
    }    
    public void addFirst(E element) {
        if (isFull()) {
            throw new IllegalStateException("Bicola is full");
        }
        array[--head] = element;
        size++;
    }    
    public void addLast(E element) {
        if (isFull()) {
            throw new IllegalStateException("Bicola is full");
        }
        array[tail++] = element;
        size++;
    }
    
    
    
    
    
    public E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Bicola is empty");
        }
        E element = array[head++];
        array[head - 1] = null;
        size--;
        return element;
    }    
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Bicola is empty");
        }
        E element = array[--tail];
        array[tail] = null;
        size--;
        return element;
    }    
    public E peekFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Bicola is empty");
        }
        return array[head];
    }    
    public E peekLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Bicola is empty");
        }
        return array[tail - 1];
    }    
    public boolean isEmpty() {
        return size == 0;
    }    
    public boolean isFull() {
        return size == array.length;
    }
}
