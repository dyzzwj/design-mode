package com.dyzwj.designmode.responsibility.chain;

public interface Handler {

    void handle(Input input,Output output,HandlerChain handlerChain);

    void destory();
}
