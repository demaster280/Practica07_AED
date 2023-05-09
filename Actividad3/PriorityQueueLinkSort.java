/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad3;

/**
 *
 * @author Gabriel
 */

import java.util.Comparator;

class PriorityQueueLinkSort<E, P extends Comparable<P>> implements PriorityQueue<E, P> {
    class EntryNode {
        E data;
        P priority;

        EntryNode(E data, P priority) {
            this.data = data;
            this.priority = priority;
        }
    }

    private Node<EntryNode> first;
    private Node<EntryNode> last;

    public PriorityQueueLinkSort() {
        this.first = null;
        this.last = null;
    }

    public void enqueue(E x, P pr) {
        EntryNode newEntry = new EntryNode(x, pr);
        if (isEmpty()) {
            this.first = new Node<EntryNode>(newEntry);
            this.last = this.first;
        } else {
            Node<EntryNode> current = this.first;
            Node<EntryNode> previous = null;
            while (current != null && pr.compareTo(current.getData().priority) <= 0) {
                previous = current;
                current = current.getNext();
            }
            if (previous == null) {
                this.first = new Node<EntryNode>(newEntry, this.first);
            } else {
                previous.setNext(new Node<EntryNode>(newEntry, current));
            }
        }
    }

    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Cannot remove from an empty queue");
        }
        E aux = this.first.getData().data;
        this.first = this.first.getNext();
        if (this.first == null) {
            this.last = null;
        }
        return aux;
    }

    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Cannot get back of an empty queue");
        }
        return this.last.getData().data;
    }

    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Cannot get front of an empty queue");
        }
        return this.first.getData().data;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public String toString() {
        String s = "";
        Node<EntryNode> current = this.first;
        while (current != null) {
            s += current.getData().data + " (" + current.getData().priority + ") ";
            current = current.getNext();
        }
        return s;
    }
}