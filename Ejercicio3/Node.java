/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Gabriel
 */
public class Node<E> {
    private E data;
    private Node<E> next;
    public Node(E data) {
        this.data = data;
        this.next = null;
    }
    public E getData() {
        return data;
    }
    public Node<E> getNext() {
        return next;
    }
    public void setNext(Node<E> next) {
        this.next = next;
    }
}

