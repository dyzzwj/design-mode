package com.dyzwj.designmode.responsibility.chain;

import com.dyzwj.designmode.responsibility.chain.handler.CheckHandler;
import com.dyzwj.designmode.responsibility.chain.handler.EchoHandler;
import com.dyzwj.designmode.responsibility.chain.handler.ExceptionHandler;

public class HandlerChainMain {

    public static void main(String[] args) {
        ExceptionHandler exceptionHandler = new ExceptionHandler();
        EchoHandler echoHandler = new EchoHandler();
        CheckHandler checkHandler = new CheckHandler();
        new ApplicationHandlerChain(new Handler[]{exceptionHandler,echoHandler,checkHandler}).doHandle(new Input(),new Output());

    }
}
