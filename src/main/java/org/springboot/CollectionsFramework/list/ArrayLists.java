package org.springboot.CollectionsFramework.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* -->ArrayList is a resizable array implementation in java.
   -->The backing data structure of ArrayList is an array of Object class.
   -->When creating an ArrayList you can provide initial capacity then the array
      is declared with the given capacity.
   -->The default capacity value is 10. If the initial capacity is not specified
      by the user then the default capacity is used to create an array of objects.
   -->When an element is added to an ArrayList it first checks whether the new
      element has room to fill or it needs to grow the size of the internal array,
   -->If capacity has to be increased then the new capacity is calculated which
      is 50% more than the old capacity and the array is increased by that capacity.

 */

public class ArrayLists {
    public static void arrayListExample(){
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Boolean> booleanArrayList = new ArrayList<>();

        //add elements
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        System.out.println(integerArrayList);

        //to get an element
        int element = integerArrayList.get(1); // 0 is the index
        System.out.println(element);

        //add element in between
        integerArrayList.add(1,4);// 1 is the index and 2 is the element to be added
        System.out.println(integerArrayList);

        integerArrayList.set(0,5);
        System.out.println(integerArrayList);

        //delete elements
        integerArrayList.remove(2);// 0 is the index
        System.out.println(integerArrayList);

        //size of the list
        int size = integerArrayList.size();
        System.out.println(size);

        //Loops on lists
        for(int i=0;i<integerArrayList.size();i++){
            System.out.print(integerArrayList.get(i));
        }
        System.out.println();

        //Sort on list
        Collections.sort(integerArrayList);
        System.out.println(integerArrayList);

        List<Integer> l = Arrays.asList(1,2,3,4,5);
        List<Integer> list = new ArrayList<>(l);
        list.subList(1,3).clear();
        System.out.println(list);


    }

}
