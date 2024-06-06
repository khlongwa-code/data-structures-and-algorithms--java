package datastructs.queues;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    /*First-In-First-Out (FIFO) principle 
     * represent collection of elements where elements are inserted at the rear
     * and removed from the front
    */

    private Queue<Integer> queue;

    public MyQueue() {
        this.queue = new LinkedList<>();
    }

    public void populateQueue() {
        /*enqueue elements to the queue 
         * - offer() method
         */

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
    }

    public void queueDetails() {
        System.out.println("Queue size: " + queue.size());
        System.out.println("First element: " + queue.peek());
    }

    public void emptyQueue() {
        /*dequeue elements from the queue
         * - poll()
         */
        while(!queue.isEmpty()) {
            int element = queue.poll();
            System.out.println("Dequeued element: " + element);
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.populateQueue();
        q.queueDetails();
        q.emptyQueue();
    }
}   
