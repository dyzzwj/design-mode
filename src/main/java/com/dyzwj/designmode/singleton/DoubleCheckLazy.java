package com.dyzwj.designmode.singleton;


/**
 * 双重检测懒汉式
 *
 *  双重检测单例优点：
 *
 *    1、对象的创建是线程安全的。
 *    2、支持延时加载。
 *    3、获取对象时不需要加锁。
 */
public class DoubleCheckLazy {


    private static DoubleCheckLazy singleton = null;

    private DoubleCheckLazy(){}

    public static DoubleCheckLazy getInstance(){
        if(singleton == null){
            synchronized (DoubleCheckLazy.class){
                if(singleton == null){
                    singleton = new DoubleCheckLazy();
                }
            }
        }
        return singleton;
    }
}
