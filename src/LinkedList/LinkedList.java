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
        * In this we have to insert Node at last position for this we first check whether list is empty or not if empty then we call
        * function insert fist and return
        * else
        * we have tail variable we do tail.next equal to newnode and tail = newNode
        */
        Node newNode = new Node(val);
        if (tail == null){
            insertFirst(val);
            return;
        }
        tail.next = newNode;
        tail =newNode;
        size++;
    }

    public void insert(int val, int index){

        /*
        * Here we have to insert Node at a perticular index in an list so first we check whether the index is 0 or last
        * so that we can directly used already define funtion for that or else
        * we will travel to index - 1 position and inset node there
        */
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i=1; i<index;i++){
            temp = temp.next;
        }
        Node newNode = new Node(val,temp.next);
        temp.next = newNode;
        size++;
    }

    public int deleteFirst(){
        /*
        * Here we have to delete first Node and return it so we just do head = head.next and then if head == null
        * means list is empty so we also do tail = null
        */
        int val = head.value;
        head =head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        /*
        * In this we have to delete last node but for that we have to go first at perv node of its so we have to travers
        * till it and then become second last node as tail and then do tail.next = null
        */
        if (size <=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    public int delete(int index){
        /*
        * Now in this we have to delete Node at perticular index so we agin find the prev of that Node and do the same as we above do
        * prev.next = prev.next.next
        */
        if (index == 0){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }
    public Node get(int index){
        /*
        * This function is to get Node as desire index
        */
        Node curr = head;
        for (int i=0;i <index;i++){
            curr = curr.next;
        }
        return curr;
    }
    public Node find(int value){
        Node curr = head;
        while (curr != null){
            if (curr.value == value){
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }
}
public class LinkedList {
    public static void main(String[] args) {

        LL l = new LL();
        l.insertFirst(8);
        l.insertLast(99);
        l.insertFirst(55);
        l.insert(69,1);
        l.printLL();
        l.deleteFirst();
        l.printLL();
        l.deleteLast();
        l.printLL();
        l.insert(45,2);
        l.insert(85,2);
        l.insert(65,2);
        l.printLL();
        l.delete(2);
        l.printLL();

    }
}
