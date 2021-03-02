package com.structure.test;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zcj
 * @date 2021/3/2 13:55
 */
public class LinkedListTest {
    private static List<Integer> sSorted = new LinkedList<>();

    @Test
    public void test(){
        int[] a ={3,2,1,1};
        for (int i = 0; i < a.length; i++) {
            addElement(a[i]);
        }
        sSorted.forEach(i-> System.out.println(i));
    }

    public static void addElement(int e){
        if (sSorted.size()==0){
            sSorted.add(e);
        }else {
            for (int i = 0; i < sSorted.size(); i++) {
                if((sSorted.get(i)==e) || (sSorted.get(i)<e&&sSorted.get(i+1)>e)){
                    sSorted.add(i+1,e);
                    break;
                }
                if (i!=0&&sSorted.get(i-1)<e&&sSorted.get(i)>e){
                    sSorted.add(i,e);
                    break;
                }
                if(i==0&&sSorted.get(i)>e){
                    sSorted.add(i,e);
                    break;
                }
            }
        }
    }

}
