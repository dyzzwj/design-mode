package com.dyzwj.designmode.singleton;

/**
 * 枚举类
 *  1、多线程安全
 *  2、懒加载
 *  3、序列化/反序列化安全
 *  4、写法简单
 */
public class EnumClass {


    public static void main(String[] args) {
        EnumClass instance = Enum.INSTACNE.getInstance();
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
