package impleQueueLinkedList;

public class Main {
    public static void main(String[] args) {
        QueueLinkedList ql = new QueueLinkedList();
        ql.enQueue("Olzhas");
        ql.enQueue(25);
        ql.enQueue("Ormanbai");
        ql.enQueue(27);
        ql.enQueue("Ospan");
        ql.enQueue(96);
        ql.enQueue("Omirgali");
        ql.enQueue(44);
        ql.enQueue("Omar");
        ql.enQueue(12);

        //Queue API
        System.out.println("Empty: " + ql.isEmpty());
        System.out.println("Size: " + ql.getSize());
        System.out.println("Front element 'peek()': " + ql.peek().getData());
        System.out.println("deQueue working: " + ql.deQueue().getData());
        System.out.println("After deQueue: " + ql.peek().getData());
        ql.deQueue();

    }
}
