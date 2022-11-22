package LinkedList;
class LL{
            private class Node{

                private int value;
                private Node next;

                public Node(int value) { //********* Constructor For Creating a Node
                    this.value = value;
                }
                public Node(int value, Node next) { //********* Constructor For Creating a Node
                    this.value = value;
                    this.next = next;
                }
            }

    private Node head;
    private Node tail;
    private int size;

    public LL() { //********* Constructor For Creating a LinkedList
        this.size = 0;
    }

    //********** ALL THE FUNCTIONS USED IN LINKED LIST ************
    public void insertFirst(int val){

        /*
        * As we have to insert the Node at first position first we will check whether the list is empty or not means if
        * head is null list is empty  then we simply point head to newNode
        * otherwise
        * newNode next will point towards head(firstNode) and then head(reference variable) point towards newNode
        */
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null){
            tail = head;
        }

    }

    public void printLL(){
        /*
        * Take a curr reference variable which start from head and goes till its next is equal to null when its next is null it will
        * stop and with each pass will print the value
        */
        Node curr = head;
        while (curr != null){
            System.out.print(curr.value + "->");
            curr = curr.next;
        }
        System.out.println("End");
    }

    public void insertLast(int val){

        /*
        * */
        Node newNode = new Node(val);
        if (tail == null){
            insertFirst(val);
            return;
        }
        tail.next = newNode;
        tail =newNode;
        size++;
    }
}
public class LinkedList {
    public static void main(String[] args) {

        LL l = new LL();
        l.insertFirst(8);
        l.insertLast(99);


        l.printLL();
    }
}
