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
        Node newNode = new Node(val);
        Node last = head;
        if (head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }
        while (last.next!= null){
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    public void insert(int val, int after){
        Node newNode = new Node(val);
        Node p = find(after);
        if (p ==null){
            System.out.printf("does not exist");
            return;
        }
        newNode.next = p.next;
        p.next =newNode;
        newNode.prev = p;
        if (newNode.next != null){
            newNode.next.prev = newNode;
        }
    }

    public Node find(int value){
        Node curr = head;
        while (curr != null){
            if (curr.val == value){
                return curr;
            }
            curr = curr.next;
        }
        return null;
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
        d.insertLast(99);
        d.insert(211,46);
        d.display();
    }
}
