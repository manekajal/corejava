

public class DoubleLinkedList {
    class Node {

        int data;
        Node pre;
        Node next;

        public Node(int data) {
            this.data = data;

        }


    }
    Node head, tail = null;
    public void add(int data){
        //  creating new node
        Node node = new Node(data);
//list emplty or not
        if(head == null){
            head=tail=node;
            head.pre=null;
            tail.next=null;

        }
        else {
            tail.next=node;
            node.pre=tail;
            tail=node;

        }
    }
    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.println(current.data);
            current = current.next;

        }
    }


        public static void main(String[] args){

            DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
            doubleLinkedList.add(1);
            doubleLinkedList.add(12);
            doubleLinkedList.add(40);
            doubleLinkedList.display();

        }


    }





