package com.dyzwj.designmode.responsibility.chain.handler;

import com.dyzwj.designmode.responsibility.chain.Handler;
import com.dyzwj.designmode.responsibility.chain.HandlerChain;
import com.dyzwj.designmode.responsibility.chain.Input;
import com.dyzwj.designmode.responsibility.chain.Output;

public class EchoHandler implements Handler {
    @Override
    public void handle(Input input, Output output, HandlerChain handlerChain) {
        System.out.println("EchoHandler");
        //向下传播
        handlerChain.doHandle(input,output);
    }

    @Override
    public void destory() {

    }
}
