package impleQueueLinkedList;

public class QueueLinkedList<T> {
    private Node front;
    private Node end;
    private int size;

    public QueueLinkedList() {
        front = null;
        end = null;
        size = 0;
    }

    public void enQueue(T data) { // insert
        Node NewNode = new Node(data);
        if(front == null) {
            end = NewNode;
            front = NewNode;
        } else {
            end.setNext(NewNode); // end -- > next = NewNode
            end = NewNode; // end = NewNode
        }
        size = size + 1;
    }

    public Node deQueue() { // delete and Retrieves element in front of queue
        Node temp = null;
        if (front != null) { // check whether queue is Empty (front == null)
            temp = new Node(front.getData()); // define Node pointer and set it to front(data)
            if(front.getNext() != null) {
                front = front.getNext(); // front = front --> next
            } else {
                front = null;
                end = null;
            }
            size = size - 1;
        }
        return temp;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public Node peek() {
        Node temp = null;
        if(!isEmpty()) {
            temp = new Node(front.getData()); // temp == front of data "front(data)"
        }
        return temp;
    }

    public int getSize() {
        return size;
    }
}
