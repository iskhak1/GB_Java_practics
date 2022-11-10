package ru.gb;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,3,5,2,8,4,6,7,-9,-99,2,1,4,22,11,12,0,0,0,0};
        MergeSort mergeSort = new MergeSort(arr);
        mergeSort.sort(arr);
        mergeSort.print();
    }
}