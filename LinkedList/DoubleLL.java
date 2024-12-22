package LinkedList;

public class DoubleLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    //Add a new Node at start of Linked List
    public static void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    //Add a new Node at last of Linked List
    public static void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    //Remove First Node of Linked List
    public static int removeFirst(){
        if(head==null) return -1;
        if(size==1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    //Remove Last Node of Linked List
    public static int removeLast(){
        if(head==null) return -1;
        if(size==1){
            int val = head.data;
            head=tail=null;
            size--;
            return val;
        }
        Node temp = head;
        for(int i=0;i<size-2;i++){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    //Reverse the Linked List
    public static void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    //Print the Linked List
    public static void printLL(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        addFirst(1);
        addFirst(2);
        addFirst(3);
        //printLL();
        addLast(4);
        addLast(5);
        addLast(6);
        printLL();
        removeFirst();
        printLL();
        removeLast();
        printLL();
        reverse();
        printLL();
    }
}
