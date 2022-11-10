package ru.gb;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Array;
import java.util.Arrays;

@Slf4j
public class MergeSort {

    private int [] arr ;

    public MergeSort(int[] arr) {
        this.arr = arr;
    }

    public void sort(int [] arr){
        int n = arr.length;
        if(n<2) return;
        int mid = n/2;

        int [] left = new int[mid];
        int [] right = new int[n-mid];
        for (int i = 0; i < mid; i++) {left[i] = arr[i];}
        for (int i = mid; i < n; i++) {right[i-mid] = arr[i];}

        sort(left);
        sort(right);
        merge(arr,left,right);

    }

    private void merge(int[] arr, int[] left, int[] right) {
        int l = 0;
        int r = 0;
        int idx = 0;
        while(l<left.length && r<right.length){

            if(left[l]<right[r]){
                arr[idx] = left[l];
                l++;
                idx++;
            }else{
               arr[idx]= right[r];
               idx++;
               r++;
            }

        }

        for (int i = l; i < left.length; i++) {
            arr[idx++] = left[i];
        }
        for (int i = r; i < right.length; i++) {
            arr[idx++] = right[i];
        }

    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }
}
