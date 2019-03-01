package com.company;

public class BubbleSort {
    public void bubbleSort (int [] sort){
    int a = 0;

        for (int j = sort.length - 1; j >= 1; j--)
            for (int i = 0; i < j; i++) {
        if (sort[i] > sort[i + 1]) {
            a = sort[i];
            sort[i] = sort[i + 1];
            sort[i+1] = a;
        }}
}
        }