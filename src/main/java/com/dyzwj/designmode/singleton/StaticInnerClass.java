package com.dyzwj.designmode.singleton;


/**
 * 静态内部类
 *  优点：
 *  1、对象的创建是线程安全的。
 *  2、支持延时加载。
 *  3、获取对象时不需要加锁。
 *
 */
public class StaticInnerClass {


    private StaticInnerClass(){}

    public static StaticInnerClass getInstance(){
        return InnerClass.instance;
    }

    static class InnerClass{
        private static StaticInnerClass instance = new StaticInnerClass();

    }
}
