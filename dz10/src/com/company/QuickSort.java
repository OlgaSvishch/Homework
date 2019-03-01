package com.company;

public class QuickSort {
    public void quickSort (int [] sort, int start, int end){


        int middle =  (start + end)/2;

        int i = start;
        int j = end;

        while (i <= j){
            while (sort [i] < sort [middle]){
                i++;
            }
            while (sort [j] > sort [middle]){
                j--;
            }
            if (i <= j) {
                int t = sort[i];
                sort[i] = sort[j];
                sort[j] = t;
                i++;
                j--;

            }

        }
        if(i < end)quickSort(sort, i, end);
        if(j > start) quickSort(sort,start, j);
    }
}
