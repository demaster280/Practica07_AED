/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad3;

/**
 *
 * @author Gabriel
 */
public class Test {
    public static void main(String[] args) {
        PriorityQueue<String, Integer> pq = new PriorityQueueLinkSort<>();

        pq.enqueue("A", 1);
        pq.enqueue("B", 2);
        pq.enqueue("C", 3);
        pq.enqueue("D", 2);
        pq.enqueue("E", 1);

        System.out.println(pq.toString()); // Output: E (1) A (1) B (2) D (2) C (3)

        try {
            System.out.println(pq.front()); // Output: E
            System.out.println(pq.back()); // Output: C
            System.out.println(pq.dequeue()); // Output: E
            System.out.println(pq.toString()); // Output: A (1) B (2) D (2) C (3)
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }
}