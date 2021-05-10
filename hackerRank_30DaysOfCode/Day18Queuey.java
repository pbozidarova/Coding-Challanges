package hackerRank_30DaysOfCode;

import java.util.LinkedList;

public class Day18Queuey {

    LinkedList queue;

    public Day18Queuey(){
        queue = new LinkedList();
    }

    public boolean isEmpty(){
        return this.queue.isEmpty();
    }

    public int size(){
        return queue.size();
    }

    public void enqueue(int n){
        this.queue.addLast(n);
    }

    public int dequeue(){
        return (int) this.queue.remove(0);
    }

    public int peek(){
        return (int) queue.get(0);
    }

    public static void main(String[] args) {
        Day18Queuey numberQueue = new Day18Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);

        System.out.println("First out: " + numberQueue.dequeue());
        System.out.println("Peek at second item: " + numberQueue.peek());
        System.out.println("Second out: " + numberQueue.dequeue());
        System.out.println("Third out: " + numberQueue.dequeue());
    }

}
