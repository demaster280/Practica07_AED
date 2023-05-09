/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad3;

/**
 *
 * @author Gabriel
 */
public class Node<T> {
    private T data;         // Dato almacenado en el nodo
    private Node<T> next;   // Referencia al siguiente nodo en la lista
    
    public Node(T data) {
        this(data, null);
    }
    
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    public Node<T> getNext() {
        return next;
    }
    
    public void setNext(Node<T> next) {
        this.next = next;
    }
}
