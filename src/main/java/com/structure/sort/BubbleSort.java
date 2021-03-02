package com.structure.sort;
/**
 * 冒泡排序
 *      时间复杂度：O（n^2)
 *      空间复杂度：
 *          最优的空间复杂度，所需排序的数组已经排好序，空间复杂度O
 *          最差的空间复杂度，逆序排列，空间复杂度O(n)
 *          平均空间复杂度，O(1)
 *       稳定：空间复杂度O(1)
 */
public class BubbleSort {
    public int[] sort(int []array){
        int n = array.length;
        int temp = 0;
        for(int i = 0; i<n;i++){
            for(int j=1;j<n-i;j++){
                if(array[j-1]>array[j]){
                    temp = array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
}
