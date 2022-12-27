package Queue;

class custom_queue{
    private int[] data;
    private static final int DEFAULT__SIZE = 10;

    int end = 0;

    public custom_queue(int size) {
        this.data = new int[size];
    }

    public custom_queue() {
        this(DEFAULT__SIZE);
    }


    private boolean isFull() {
        return end == data.length ;
    }
    private boolean isEmpty() {
        return end == 0;
    }
}

public class CustomQueue {
    public static void main(String[] args) {

    }
}
