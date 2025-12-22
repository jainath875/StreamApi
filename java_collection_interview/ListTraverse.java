package java_collection_interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTraverse {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Seeta");
        list.add("John");
        list.add("Peter");

        //simple loop
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Enhanced for
        for(String name: list) {
            System.out.println(name);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        //forEach
        list.forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        //using iterator
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {

            System.out.println(itr.next());
            
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        //Using ListIterator -- forward and backward direction
        ListIterator<String> listItr = list.listIterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

        //reverse
        ListIterator<String> listIterator2 = list.listIterator(list.size());
        while (listIterator2.hasPrevious()) {
            System.out.println(listIterator2.previous());
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");


    }
    
}
