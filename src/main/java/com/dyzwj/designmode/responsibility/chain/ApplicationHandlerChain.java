package com.dyzwj.designmode.responsibility.chain;

import java.util.Arrays;

public class ApplicationHandlerChain implements HandlerChain{

    private Handler[] handlers;

    public ApplicationHandlerChain(Handler[] handlers){
        if(handlers == null || handlers.length == 0){
            throw new IllegalArgumentException("'handlers' cannoy be empty");
        }
        this.handlers = Arrays.copyOf(handlers,handlers.length);
    }

    @Override
    public void doHandle(Input input, Output output) {
        new VirtualHandlerChain(handlers).doHandle(input,output);
    }

    @Override
    public void destory() {
        for (Handler handler : handlers) {
            handler.destory();
        }
    }

    private static  class VirtualHandlerChain implements HandlerChain{

        private final Handler[] handlers;

        private Integer currentPos = 0;

        public VirtualHandlerChain(Handler[] handlers){
            this.handlers = handlers;
        }


        @Override
        public void doHandle(Input input, Output output) {
            if(currentPos >= handlers.length){
                return;
            }
            Handler handler = handlers[currentPos++];
            handler.handle(input,output,this);
        }

        @Override
        public void destory() {

        }
    }

}
