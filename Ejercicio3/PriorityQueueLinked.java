/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import Actividad3.PriorityQueue;

public class PriorityQueueLinked<E, P extends Comparable<P>> implements PriorityQueue<E, P> {

    private PriorityQueueLinkSort<E, P>[] queues; // arreglo de colas basadas en listas enlazadas
    private int size; // cantidad de prioridades
    
    public PriorityQueueLinked(int size) {
        this.size = size;
        queues = new PriorityQueueLinkSort[size];
        for (int i = 0; i < size; i++) {
            queues[i] = new PriorityQueueLinkSort<>();
        }
    }

    public void enqueue(E element, P priority) {
        int index = getIndex(priority);
        queues[index].enqueue(element, priority);
    }

    public E dequeue() throws ExceptionIsEmpty {
        for (int i = 0; i < size; i++) {
            if (!queues[i].isEmpty()) {
                return queues[i].dequeue();
            }
        }
        throw new ExceptionIsEmpty("Cannot remove from an empty queue");
    }

    public E front() throws ExceptionIsEmpty {
        for (int i = 0; i < size; i++) {
            if (!queues[i].isEmpty()) {
                return queues[i].front();
            }
        }
        throw new ExceptionIsEmpty("Cannot get front of an empty queue");
    }

    public E back() throws ExceptionIsEmpty {
        for (int i = size - 1; i >= 0; i--) {
            if (!queues[i].isEmpty()) {
                return queues[i].back();
            }
        }
        throw new ExceptionIsEmpty("Cannot get back of an empty queue");
    }

    public boolean isEmpty() {
        for (int i = 0; i < size; i++) {
            if (!queues[i].isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private int getIndex(P priority) {
        int index = 0;
        for (int i = 1; i < size; i++) {
            if (priority.compareTo(queues[i].isEmpty() ? null : queues[i].front().priority) < 0) {
                index = i;
            }
        }
        return index;
    }
}