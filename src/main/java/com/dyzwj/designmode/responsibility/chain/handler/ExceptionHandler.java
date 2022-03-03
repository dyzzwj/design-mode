package com.dyzwj.designmode.responsibility.chain.handler;

import com.dyzwj.designmode.responsibility.chain.Handler;
import com.dyzwj.designmode.responsibility.chain.HandlerChain;
import com.dyzwj.designmode.responsibility.chain.Input;
import com.dyzwj.designmode.responsibility.chain.Output;

public class ExceptionHandler implements Handler {

    @Override
    public void handle(Input input, Output output, HandlerChain handlerChain) {
        try{
         handlerChain.doHandle(input,output);
        }catch (Exception e){
            System.out.println("exception");
        }
        System.out.println("ExceptionHandler");
    }

    @Override
    public void destory() {

    }
}
