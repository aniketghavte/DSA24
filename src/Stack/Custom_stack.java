package Stack;

import java.security.spec.ECField;

class Stacks{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public Stacks(int size) {
        this.data = new int[size];
    }

    public Stacks() {
        this(DEFAULT_SIZE);
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("cannot pop stack is empty!!");

        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }
    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("cannot peek stack is empty!!");

        }
        return data[ptr];
    }

    private boolean isFull() {
        return ptr == data.length -1;
    }
    private boolean isEmpty() {
        return ptr == -1;
    }
}

public class Custom_stack {
    public static void main(String[] args) throws Exception {

        Stacks s = new Stacks();
        s.push(5);
        s.push(8);
        s.push(9);
        s.push(7);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        System.out.println(s.peek());
    }
}
