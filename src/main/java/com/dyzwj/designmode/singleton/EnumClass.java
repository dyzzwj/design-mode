package com.dyzwj.designmode.singleton;

/**
 * 枚举类
 *  1、多线程安全
 *  2、懒加载
 *  3、序列化/反序列化安全
 *  4、写法简单
 */
public class EnumClass {


    public static void main(String[] args) throws InterruptedException {
        EnumClass instance = Enum.INSTACNE.getInstance();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            Object o = new Object();
            if(i % 10 == 0){
                Thread.sleep(200);
            }
        }


    }
    enum Enum{
        INSTACNE;
        private EnumClass enumClass = null;
        private Enum(){
            enumClass = new EnumClass();
        }
        public EnumClass getInstance(){
            return enumClass;
        }
    }
}
