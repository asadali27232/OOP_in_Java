package Task1;

import java.util.ArrayList;

public class Queue<T> {
    private ArrayList<T> queue;
    private int size;

    public Queue(int size) {
        this.queue = new ArrayList<T>(size);
        this.size = size;
    }

    public void enqueue(T element) throws Exception {
        if (queue.size() == this.size) {
            throw new Exception();
        } else
            queue.add(queue.size(), element);

    }

    public void dequeue() throws Exception {
        if (queue.size() == 0) {
            throw new Exception();
        }
        queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public boolean isFull() {
        return queue.size() == this.size;
    }

    @Override
    public String toString() {
        return queue.toString();
    }

    public static void main(String[] args) {
        Queue<Integer> integerQueue = new Queue<Integer>(5);
        try {
            integerQueue.enqueue(25);
            integerQueue.enqueue(10);
            integerQueue.dequeue();

            integerQueue.enqueue(89);
            integerQueue.enqueue(70);
            integerQueue.enqueue(78);

            integerQueue.dequeue();
            integerQueue.dequeue();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(integerQueue.isEmpty());
        System.out.println(integerQueue.isFull());
        System.out.println(integerQueue);
    }
}
