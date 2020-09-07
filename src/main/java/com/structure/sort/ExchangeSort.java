package com.structure.sort;

public class ExchangeSort {
    /**
     * 交换排序，两层for循环
     *    时间复杂度：O（n^2)
     *    空间复杂度：
     *        最优的空间复杂度，所需排序的数组已经排好序，空间复杂度O
     *        最差的空间复杂度，逆序排列，空间复杂度O(n)
     *        平均空间复杂度，O(1)
     * @param array
     * @return
     */
    public int[] sort(int []array){

        int n = array.length;
        int temp= 0;
        for(int i = 0; i<n;i++){
            for(int j = i+1 ;j < n; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
