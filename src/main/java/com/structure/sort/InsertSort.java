package com.structure.sort;

public class InsertSort {

    /**
     * 插入排序：
     *      每次选出一个待排序元素，将该元素插入到前边已经排好序的合适位置，直到全部插入完成
     *
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * 空间复杂度：不稳定
     * @param array
     * @return
     */
    public int[] sort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];//待排序元素
            int j = 0 ;
            for (j = i; j > 0 && array[j-1] > temp; j--) {
                array[j] = array[j-1];
            }
            array[j] = temp;
        }
        return array;
    }
}
