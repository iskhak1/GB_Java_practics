package ru.gb;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    private List<Integer> list;
    private List<Integer> values;
    public Ex2(List<Integer> list) {
        this.list = list;
        values = new ArrayList<>();
    }

    public void removeEvenNum(){
      int del = list.size()-1;
      while(del>=0){
          if(list.get(del)%2==0) {
              list.remove(del);
          }
          del--;
      }
    }
    public void printList(){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }


}
