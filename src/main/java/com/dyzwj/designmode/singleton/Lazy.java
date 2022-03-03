package com.dyzwj.designmode.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 懒汉式
 *
 *  优点：
       1、对象的创建是线程安全的。
       2、支持延时加载。
 * 缺点：
 *    1、获取对象的操作被加上了锁，影响了并发度。
 *    2、如果单例对象需要频繁使用，那这个缺点就是无法接受的。
 *    3、如果单例对象不需要频繁使用，那这个缺点也无伤大雅。
 *
 */
public class Lazy {

    private static Lazy instance = null;
    private Lazy(){}

    public static Lazy getInstance(){

        synchronized (Lazy.class){
            if(instance == null){
                instance = new Lazy();
            }
            return instance;
        }
    }


    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("aa","bb");
        getMap(map);

        System.out.println(map);
    }

    private static void getMap(Map<String, String> map) {
        map = new HashMap<>();
    }

}
