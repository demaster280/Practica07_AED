/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EjercicioTres;

/**
 *
 * @author 51957
 */
public interface PriorityQueue<E, P> {
    void enqueue(E elemento, P prioridad);
    E dequeue() throws ExcepcionColaVacia;
    E front() throws ExcepcionColaVacia;
    E back() throws ExcepcionColaVacia;
    boolean isEmpty();
}
