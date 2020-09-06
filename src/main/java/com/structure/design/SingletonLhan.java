package com.structure.design;

/**
 * 单例模式：懒汉式
 */
public class SingletonLhan {
    private static SingletonLhan instance;
    private SingletonLhan(){

    }
    public static SingletonLhan getInstance() {
        if(instance==null){
            instance = new SingletonLhan();
        }
        return instance;
    }
}
