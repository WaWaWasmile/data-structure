package com.structure.sort;

public class SelectSort {
    /**
     * 选择排序：
     *   首先默认a[0]位置元素是最小的
     *   第一趟排序选出数组中最小的元素，放在a[0]位置（选择出剩余元素比a[0]更小的，然后交换元素，a[0]最小）
     *   第二趟排序，选出剩下元素中最小的元素，放在a[1]位置
     *   。。。
     *   直到数组遍历完成，数组有序
     *
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * 空间复杂度：不稳定
     * @param array
     * @return
     */
    public int[] sort(int []array){
        int n = array.length;
        int temp = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            index = i;
            for (int j = i+1; j < n; j++) {
                if(array[index] < array[j]){
                    index = j;
                }
            }
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
