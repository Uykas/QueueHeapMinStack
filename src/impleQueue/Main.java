package impleQueue;

public class Main {

    public static void main(String[] args) {
        Queue q = new Queue();

        int n = 100000;
        for (int i = 0; i < n; i++) {
            q.add(i);
        }
        long time1 = System.nanoTime();
        q.peek();
        long time2 = System.nanoTime();
        System.out.println("peak() : Queue  " + (time2 - time1));
        for (int i = 0; i < n; i++) {
            q.forTimeAnalysis();
        }
        System.out.println("Adds the element at the end of the queue: ");
        q.add(8);
        q.add(4);
        q.add(3);
        q.add(5);
        System.out.println("Origin Queue: ");
        q.show();

        System.out.println("Retrieves and deletes the front element of the queue FIFO: ");
        q.delete();

        System.out.println("Returns a reference to the front element of the queue: ");
        q.peek();
        q.show();
    }
}
