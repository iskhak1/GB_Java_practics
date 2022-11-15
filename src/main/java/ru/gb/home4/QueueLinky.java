package ru.gb.home4;

import java.util.LinkedList;

public class QueueLinky {

    private final LinkedList list ;

    public QueueLinky(LinkedList list) {
        this.list = list;
    }

    public void endqueue(Object o){
        list.add(o);
    }

    public Object dequeue(){
        System.out.println(list.getFirst());
        list.remove(0);
        return list;
    }

    public Object getFirst(){
        return list.getFirst();
    }

}
