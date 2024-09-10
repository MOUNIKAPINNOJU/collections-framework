package org.springboot.CollectionsFramework.list;

import java.util.LinkedList;

public class LinkedLists {
     public static void linkedListExample(){
        LinkedList<String> stringLinkedList = new LinkedList<String>();
        stringLinkedList.add("mounika");
        stringLinkedList.add("pinnoju");
        stringLinkedList.add("is");

        stringLinkedList.addLast("SD");
        stringLinkedList.addFirst("Hi All,");

        System.out.println(stringLinkedList);
        System.out.println(stringLinkedList.get(1));
        System.out.println(stringLinkedList.remove(2));
        System.out.println(stringLinkedList.removeFirst());
        System.out.println(stringLinkedList.removeLast());
    }
}
