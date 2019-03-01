package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int n = 12;
        int[] sort = new int[n];
        Random random = new Random();
        PrintArray printArray = new PrintArray();
        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();

        for (int i = 0; i < sort.length; i++) {
            sort[i] = random.nextInt(100);
        }

        printArray.printArray(sort);
        bubbleSort.bubbleSort(sort);
        printArray.printArray(sort);

        for (int i = 0; i < sort.length; i++) {
            sort[i] = random.nextInt(100);
        }

        printArray.printArray(sort);
        quickSort.quickSort(sort, 0, 11);
        printArray.printArray(sort);
    }
}
