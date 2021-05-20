package impleHeap;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Heap h = new Heap();
        int n = 100000;
        for (int i = 0; i < n; i++) {
           h.add(i);
        }
        long time1 = System.nanoTime();
        h.get(50000);
        long time2 = System.nanoTime();
        System.out.println("get(50000) : Heap  " + (time2 - time1));
        for (int i = 0; i < n; i++) {
            h.removeLast();
        }

        h.add(5);
        h.add(4);
        h.add(0);
        h.add(3);
        h.add(2);
        h.add(9);

        System.out.println("Origin MinHeap: ");
        h.show();

        System.out.println("Remove last element: ");
        h.removeLast();
        h.show();

        System.out.println("Remove min element: ");
        h.removeMin();
        h.show();

        System.out.println("Add forward new element, without changing (without traversUp): ");
        h.addForward(89);
        h.show();

        System.out.println("asd");
        Queue q = new LinkedList();
        q.add(53);
        q.add(54);
        System.out.println(q.poll());

    }
}
