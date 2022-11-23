package LinkedList;
class DLL{

    Node head;
    public void insertFirst(int val){
        Node newNode =new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if (head != null){
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertLast(int val){

    }

    public void display(){
        Node curr = head;
        Node last = null;
        while (curr != null){
            System.out.print(curr.val + "->");
            last = curr;
            curr = curr.next;
        }
        System.out.println("End");

        System.out.println("Print in reverse");
        while (last != null){
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("Start");
    }

    private class Node{
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }

    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {

        DLL d = new DLL();
        d.insertFirst(45);
        d.insertFirst(46);
        d.insertFirst(47);
        d.display();
    }
}
