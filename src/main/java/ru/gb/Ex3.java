package ru.gb;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex3 {
    public Ex3(List<Integer> list) {
        this.list = list;
    }

    public int getMin(){

        Collections.sort(list,Comparator.reverseOrder());
        return list.get(list.size()-1);
    }
    public int getMax(){

        Collections.sort(list,Comparator.reverseOrder());
        return list.get(0);
    }

    public double getMidSum(){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) 
            sum = sum+list.get(i);

        return sum/list.size();
    }

    private List<Integer> list ;
}
