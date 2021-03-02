package com.structure.test;

import org.junit.jupiter.api.Test;

/**
 * @author zcj
 * @date 2021/3/2 13:35
 */
public class sum {

    /**
     * 1-100以内的质数和
     */
    @Test
    public void sumTest(){
        int n = 0;
        for (int i=2;i<=100;i++){
            boolean l = true;
            flag :for (int j=2;j<=i;j++){
                if (i!=j&&i%j==0 ){
                    l=false;
                    break flag;
                }
            }
            if (l){
                n+=i;
            }
        }
        System.out.println("1-100所有的质数和为："+n);
    }
}
