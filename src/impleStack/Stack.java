package impleStack;

public class Stack<T> { // Object[] array
    private Object[] array;
    private int size = 0;
    private int capacity = 5;

    public Stack() {
        array = new Object[capacity];
    }
    private T get(int index) {
        return (T) array[index];
    }
    public void push(T data) {
        if (size == capacity) {
            increaseBuffer();
        }
        array[size++] = data;
    }

    public T pop() {
        T data = null;
        if(isEmpty() == true) {
            System.out.println("Empty пусто");
        }
        else {

        size = size - 1;
        data = (T) array[size];
        array[size] = 0;
        }
        return data;

    }

    public T peek() {
        T data;
        data = (T) array[size-1];
        return data;
    }
    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        return size <= 0;
    }
    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
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
}
