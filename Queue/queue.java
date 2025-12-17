package dataStructure;

public class queue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor to initialize the queue
    public queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        size = 0;
        rear = -1;
    }

    // Enqueue method
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + data);
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
    }

    // Dequeue method
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
            return -1;
        }
        int dequeuedValue = arr[front];
        front = (front + 1) % capacity;
        size--;
        return dequeuedValue;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Get the current size of the queue
    public int getSize() {
        return size;
    }

    // Peek the front element
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        queue queue = new queue(5);  
        queue.enqueue(5);
        queue.enqueue(12);
        queue.dequeue();
        queue.enqueue(50);
       

        System.out.println("Front element is: " + queue.peek());
        System.out.println("Queue size is: " + queue.getSize());

        queue.dequeue();
        queue.dequeue();
       
    }
}
