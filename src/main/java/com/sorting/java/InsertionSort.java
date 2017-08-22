package com.sorting.java;

/**
 * Created by raviteja on 8/21/17.
 */
public class InsertionSort {
    public static void insertionSort(int[] input){
        print(input);
        for(int i=1;i<input.length;i++){
            int val = input[i];
            int k=0;
            while(k<i){
                if(input[k]>val){
                    int temp = val;
                    val = input[k];
                    input[k] = temp;
                }
                k++;
            }
            input[i] = val;
        }
        print(input);
    }
    public static void print(int[] print){
        for(int i=0; i<print.length; i++){
            System.out.print(print[i]+",");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int[] input = {5,2,4,8,1,3,9,0,6,4,4,4,4,4,7};
        InsertionSort.insertionSort(input);
        InsertionSort.print(input);
    }
}
