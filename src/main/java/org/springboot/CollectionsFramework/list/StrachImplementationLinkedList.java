package org.springboot.CollectionsFramework.list;

public class StrachImplementationLinkedList {
    public static void strachImplementationOfLinkedList(){
        LL list = new LL();
        list.addFirst("mounika");
        list.addLast("SD");
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");
        list.addLast("E");
        list.removeFirst();
        list.removeLast();
        list.printList();
    }

}


class LL {
    Node head;
    private int size;
    LL(){
        size = 0;
    }
    class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String dataFirst){
        Node newNode = new Node(dataFirst);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String dataLast){
        Node newNode = new Node(dataLast);
        if(head==null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printList(){
        Node currentNode = head;
        while(currentNode!=null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("Nothing to delete");
        }

        head = this.head.next;
        size--;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("Nothing to delete");
        }

        Node lastSecondNode = head;
        while(lastSecondNode.next.next!=null){
            lastSecondNode = lastSecondNode.next;
        }
        lastSecondNode.next=null;
    }
}

