package LinkedList;

public class LinkedList {

    public static class Node{ //Creates a single node 
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
    }
}
