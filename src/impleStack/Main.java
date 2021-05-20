package impleStack;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();

        int n = 100000;
        for (int i = 0; i < n; i++) {
            s.push(i);
        }
        long time1 = System.nanoTime();
        System.out.println(s.peek());
        long time2 = System.nanoTime();
        System.out.println("pop() : Stack  " + (time2 - time1));
        for (int i = 0; i < n; i++) {
            s.pop();
        }

        System.out.println("Adds the element at the top of the stack: ");
        s.push(4);
        s.push(8);
        s.push(9);
        s.show();

        System.out.println("Returns a reference to the topmost element of the stack: " + s.peek());
        s.show();

        System.out.println("Retrieves and deletes the topmost element of the stack: " + s.pop());
        s.show();
    }
}
