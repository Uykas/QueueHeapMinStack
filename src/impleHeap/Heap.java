package impleHeap;

public class Heap<T extends Comparable <T>>{ // Min Heap // ArrayList because use here increaseBuffer
    private Object[] array;
    private int size = 1;
    private int capacity = 5;

    public Heap() {
        array = new Object[capacity];
    }
    public T get(int index) {return (T) array[index]; }

    public void add(T newItem) {
        if (size == capacity) {
            increaseBuffer();
        }
        array[size++] = newItem;
        traverseUp(size - 1);
    }
    private void traverseUp(int index) {
        if (index == 1) {
            return;
        } // base case

        int parent = index / 2;
        if (compareParentIndex(index) == 1) {
         swap(index, parent);
            traverseUp(parent);
        }
        /*
        if(parent>1) { // how do compareTo here compareTo(index,parent) == 0
           // swap(get(index), get(parent));
            traverseUp(parent);
        }
        */

    }

    private void heapify(int index){

        if(NoChild(leftChildInd(index),rightChildInd(index)) == -1) {

            return;
        }
        if(compareIndMoreThanMin(index) == true) {
            swap(index, findMinInd(index));
            heapify(findMinInd(index));
        }
        /*
        if(NoChild) return;
        int minChildIndex = getMinChildInd(left, right);

        if (array[index] > array[min] use compareTo here {
            swap(array[index, array[minChildInd]);
            heapify(minChildIne);
        }
         */
    }
    public void swap(int p, int c ){
        Object tmp =  array[p];
        array[p] = array[c];
        array[c] = tmp;

    }
    public int NoChild(int left, int right) {
        if(left >=size || right >=size){
            return -1;
        }
        return 1;
    }
    public void anyMethodWithCompare(int index) {
        T left = get(leftChildInd(index));
        T right = get(rightChildInd(index));
        if(left.compareTo(right) > 0) {

        }
    }
    public boolean compareIndMoreThanMin(int index) {
        T main = get(index);
        T min = get(findMinInd(index));

        if(main.compareTo(min) >= 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public int compareParentIndex(int index) {
        T dad = get(index/2);
        T baby = get(index);
        if (dad.compareTo(baby) > 0) {
            return 1;
        }
        return -1;
    }

    private int ParentInd(int index) {return index/2;}

    private int leftChildInd(int index) {return 2*index;}
    private int rightChildInd(int index) {return  2*index+1;}

    public int findMinInd(int index) {
        T left = get(leftChildInd(index));
        T right = get(rightChildInd(index));

        if(left.compareTo(right) >= 0) {
            return rightChildInd(index);
        }
        else if (left.compareTo(right) < 0) {
            return leftChildInd(index);
        }
        return -1;
    }
    public void removeLast() {
        size--;
    }

    public void removeMin() {
        T removingElement = get(1);
        array[1] = array[size - 1];
        size--;
        heapify(1);
        return;
    }
    public void addForward(T newItem) {
        if (size == capacity) {
            increaseBuffer();
        }

        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1]; // moving right
        }
        size++;
        array[1] = newItem; // Insertion

    }

    private void increaseBuffer() {
        capacity = (int) (1.5 * capacity);
        Object[] array2 = new Object[capacity];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }

        array = array2;
    }
    public void show() {
        for (int i = 1;i < size;i++) {
            System.out.println(array[i] + " ");
        }
    }
}