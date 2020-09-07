package com.structure.sort;

public class QuickSort {
    /**
     * 快速排序：
     *     采用双指针法，选取一个基准值，将数组先从右向左扫描，找到小于基准值的元素
     *     再从左向右扫描，找到大于基准值的元素，然后交换这两个元素。
     *     当左右指针相等时，将基准值与相等位置上的元素交换，此时完成了第一趟排序
     *     此时当前基准值的元素已经有序，以基准值所在的位置将数组一分为二，
     *     左边数组和右边数组用同样的方法使整个数组有序
     *
     * 时间复杂度：O(n*log2n)
     * 空间复杂度：O(n*log2n)
     * 最坏时间复杂度：O(n2)
     * 不稳定：空间复杂度：O(log2n)~O(n)
     *
     * @param array
     * @return
     */
    public void sort(int[] array, int left, int right){

        if(left>right){
            return ;
        }
        int base = array[left];//存放基准数
        int temp = 0;
        int i = left;
        int j = right;
        while(i != j){
            //首先从右往左扫描，当比较右边元素与基准数大小，
            // 比基准数大就继续扫描下一个元素（找到比基准数小的元素）
            while (base <= array[j] && i<j){
                j--;
            }
            //从左往右扫描，找到比基准数大的元素
            while (base >= array[i] && i<j) {
                i++;
            }

            //如果以上两个循环扫描完成，表示在i<j时找到了左边数组大于基准数的元素
            //右边数组小于基准数的元素
            //交换这两个元素
            if(i<j){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        //while(i != j)循环结束，说明找到了i==j的位置
        //将这个位置上的元素与基准数交换，基准数就被放在了正确的位置
        //以基准数所在的位置，一分为二，左边数组和右边数组重复以上排序方法
        array[left] = array[i];
        array[i] = base;

        //递归，将左边数组按照以上排序方式，使左边数组有序
        sort(array, left,i-1);
        //将右边数组按照以上排序方式，使右边数组有序
        sort(array,i+1,right);
    }
}
