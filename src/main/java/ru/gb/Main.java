package ru.gb;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,3,5,2,8,4,6,7,-9,-99,2,1,4,22,11,12,0,0,0,0};
        MergeSort mergeSort = new MergeSort(arr);
        mergeSort.sort(arr);
        mergeSort.print();

        int a [] ={34,42,2,4,66,88,10,23, 39, 25, 15, 25, 33 ,24};
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0; i <a.length; i++) {
            list.add(i,a[i]);
        }
        Ex2 ex2 = new Ex2(list);
        ex2.printList();
        ex2.removeEvenNum();
        ex2.printList();

        int a2 [] ={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list2= new ArrayList<>();
        for (int i = 0; i <a.length; i++) {
            list2.add(i,a[i]);
        }

        Ex3 ex3 = new Ex3(list2);
        System.out.println(ex3.getMin());
        System.out.println(ex3.getMax());
        System.out.println(ex3.getMidSum());

    }
}