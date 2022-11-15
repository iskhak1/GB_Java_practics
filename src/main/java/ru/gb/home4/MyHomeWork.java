package ru.gb.home4;


import java.util.LinkedList;
import java.util.List;

public class MyHomeWork {


    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        System.out.println(linky((LinkedList) linkedList));

        QueueLinky linky = new QueueLinky((LinkedList) linkedList);
        linky.endqueue(8);
        System.out.println(linkedList);
        linky.dequeue();
        System.out.println(linkedList);
        System.out.println(linky.getFirst());



    }

    private static List linky(LinkedList linkedList) {
        LinkedList list = new LinkedList();
        for (int i = 0; i <= linkedList.size()-1; i++) {
            list.add(linkedList.size()-i);
        }

        return list;
    }
}
