package impleQueue;

public class Queue<T> { // ArrayList
    private Object[] array;
    private int size = 0;
    private int capacity = 5;


    private int front;
    private int end;

    public Queue() {
        array = new Object[capacity];
    }

    private T get(int index) {
        return (T) array[index];
    }

    public void add(T newItem) {
        if (size == capacity) {
            increaseBuffer();
        }
        array[size++] = newItem;
        enQueue(newItem);
    }
    public T peek() {
        return get(0);
    }
    public void forTimeAnalysis() { // Just a delete beauty without outputting
        if (isEmpty() == true) {
            return;
        }
        deQueue();
    }
    public void delete() {
        if (isEmpty() == true) {
            return;
        }
        System.out.println(deQueue());
    }

    private void enQueue(T data) { // insert
        array[end] = data;
        end = end + 1;

    }
    public boolean isEmpty() {
        return getSize() == 0;
   }
    private T deQueue() {

        array[0] = array[size - 1];
        size--;
        T data = (T) array[front];
        front = front + 1;
        return data;
    }
    public void show() {
        if(isEmpty() == true) {
            System.out.println("Empty");
            return;
        }
        for (int i = 0; i < getSize(); i++) {
            System.out.println(array[front + i] + " ");
        }
    }
    private void increaseBuffer() {
        capacity = (int) (1.5 * capacity);
        Object[] array2 = new Object[capacity];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }

        array = array2;
    }
    public int getSize() {
       return size;
    }
}
