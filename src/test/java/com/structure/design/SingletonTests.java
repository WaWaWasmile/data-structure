package com.structure.design;

import org.junit.jupiter.api.Test;

public class SingletonTests {

    @Test
    public void singletonLhan() {

        SingletonLhan s1 = SingletonLhan.getInstance();
        SingletonLhan s2 = SingletonLhan.getInstance();
        if(s1==s2){
            System.out.println("单例模式：懒汉式同一个实例");
        }else{
        System.out.println("单例模式：懒汉式不同实例");
        }
    }

    @Test
    public void singletonEhan(){
        SingletonEhan s1 = SingletonEhan.getInstance();
        SingletonEhan s2 = SingletonEhan.getInstance();
        if(s1==s2){
            System.out.println("单例模式：饿汉式同一个实例");
        }else{
            System.out.println("单例模式：饿汉式不同实例");
        }
    }
}
