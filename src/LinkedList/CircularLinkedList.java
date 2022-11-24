package LinkedList;
class CLL{
    private Node head;
    private Node tail;

    public CLL(){
        this.head= null;
        this.tail = null;
    }
    public void insert(int val){
        Node newNode = new Node(val);
        if (head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }
    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {

    }
}
