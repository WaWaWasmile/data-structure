package com.structure.sort;

public class ShellSort {
    /**
     * 希尔排序：插入排序的升级版
     *     缩小增量+插入排序：将数组分为一个一个的区间，分别在自己的区间上使用插入排序
     *     直到区间长度被分割长度为1时，完成最后一次的插入排序后结束，排序完成
     *
     *  最好时间复杂度：O(n)
     *  平均时间复杂度O(n^1.3)
     * 最坏时间复杂度：O(n2)
     * 稳定性：不稳定
     * 空间复杂度：O(1)
     * @param array
     * @return array
     */
    public int[] sort(int[] array){
        //计算增量步长
        for(int step = array.length/2; step > 0; step/=2 ){
            //对每个区间的元素使用插入排序，（注意插入排序增量是1，这里增量是步长）
            for (int i = step; i<array.length; i++){
                int temp = array[i];
                int j;
                for(j = i - step; j>=0 && array[j] > temp; j-=step){
                    //j为左区间的取值，j+step为右区间，与左区间对应的元素，交换二者的值
                    array[j+step] = array[j];
                }
                array[j+step] = temp;
            }
        }
        return array;
    }
}
