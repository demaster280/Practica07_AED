

package inveparte3;
import java.util.NoSuchElementException;


public class InveParte3<E> {
    private Node head;
    private Node tail;
    private int size;    
    private class Node {
        private E element;
        private Node prev;
        private Node next;        
        public Node(E element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }    
    public InveParte3() {
        head = null;
        tail = null;
        size = 0;
    }    
    public void addFirst(E element) {
        Node newNode = new Node(element, null, head);
        if (head != null) {
            head.prev = newNode;
        } else {
            tail = newNode;
        }
        head = newNode;
        size++;
    }  
    
    
    
    
    
    public void addLast(E element) {
        Node newNode = new Node(element, tail, null);
        if (tail != null) {
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
        size++;
    }   
    public E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Bicola is empty");
        }
        E element = head.element;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        return element;
    }    
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Bicola is empty");
        }
        E element = tail.element;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
        return element;
    }
    
    public E peekFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Bicola is empty");
        }
        return head.element;
    }    
    public E peekLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Bicola is empty");
        }
        return tail.element;
    }
    public boolean isEmpty() {
        return size == 0;
    }    
    public int size() {
        return size;
    }
}
