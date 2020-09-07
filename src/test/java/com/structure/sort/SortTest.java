package com.structure.sort;

import org.junit.jupiter.api.Test;

public class SortTest {

    @Test
    public void insertSortTest(){
        int[] array={2,1,4,7,3,9,6};
        InsertSort insertSort = new InsertSort();
        int[] a = insertSort.sort(array);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /**
     * 快速排序
     */
    @Test
    public void quickSortTest(){
        int[] array={2,1,4,7,3,9,6};
        QuickSort quickSort = new QuickSort();
        int n = array.length;
        quickSort.sort(array, 0, n-1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 选择排序
     */
    @Test
    public void selectSortTest(){
        int[] array={2,1,4,7,3,9,6};
        SelectSort selectSort = new SelectSort();
        int[] a = selectSort.sort(array);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /**
     * 交换排序
     */
    @Test
    public void exchangeSortTest(){
        int[] array={2,1,4,7,3,9,6};
        ExchangeSort exchangeSort = new ExchangeSort();
        int[] a = exchangeSort.sort(array);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /**
     * 冒泡排序
     */
    @Test
    public void bubbleSortTest(){
        int[] array={2,1,4,7,3,9,6};
        BubbleSort bubbleSort = new BubbleSort();
        int[] a = bubbleSort.sort(array);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
