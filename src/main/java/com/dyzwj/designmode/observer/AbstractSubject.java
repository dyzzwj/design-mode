package com.dyzwj.designmode.observer;

public interface AbstractSubject {
    void addObserver(AbstractObserver abstractObserver);
    void removeObserver(AbstractObserver abstractObserver);


    void notice();
}
