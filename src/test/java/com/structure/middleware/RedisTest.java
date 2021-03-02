package com.structure.middleware;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import sun.rmi.runtime.Log;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * @author zcj
 * @date 2021/2/3 18:32
 */
@Slf4j
public class RedisTest {

    @Test
    public void test(){
        int x =-2147483648;
        Integer abs = x;
        if (x<0){
            abs = -x;
        }
        String[] strs={""};
        List<String> collect = Arrays.stream(strs).sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        Stack<Character> stack = new Stack();
        String s = String.valueOf(abs);
        for (Character c : s.toCharArray()) {
            if (!"-".equals(c.toString())) {
                stack.push(c);
            }
        }
        StringBuffer sbf = new StringBuffer();
        while (!stack.empty()){
                sbf.append(stack.pop());
        }
        Long sum = Long.valueOf(sbf.toString());
        Long max = Long.valueOf(String.valueOf(Integer.MAX_VALUE));
        Long min = Long.valueOf(String.valueOf(Integer.MIN_VALUE));
        if (x<0){
            sum = -sum;
        }
        if (sum > max || sum<min){
            log.info("0");
        }else {
            int i = Integer.valueOf(String.valueOf(sum));
           log.info("{}",i);
        }
    }
}
