package com.dyzwj.designmode.singleton;


/**
 * 饿汉式
 *  优点：
 *      1、单例对象的创建是线程安全的；(jvm类加载机制保证的)
 *      2、获取单例对象时不需要加锁。
 *   缺点：单例对象的创建，不是延时加载。
 *
 */
public class Hungry {
    private static final Hungry instance = new Hungry();
    public static Hungry getInstance(){
        return instance;
    }

}
