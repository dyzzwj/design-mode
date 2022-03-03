package com.dyzwj.designmode.responsibility.chain;

public interface HandlerChain {

    void doHandle(Input input,Output output);

    void destory();

}
