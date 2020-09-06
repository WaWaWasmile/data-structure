package com.structure.design;

/**
 * 单例模式：饿汉式
 */
public class SingletonEhan {
    private static SingletonEhan instance = new SingletonEhan();
    private SingletonEhan(){}

    public static SingletonEhan getInstance() {
        return instance;
    }
}
