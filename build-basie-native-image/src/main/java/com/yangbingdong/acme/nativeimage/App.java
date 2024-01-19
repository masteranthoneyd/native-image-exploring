package com.yangbingdong.acme.nativeimage;

import com.yangbingdong.acme.nativeimage.reflection.StringHandlerInvoker;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello Native Image!");

        String handlerName = args[0];
        String input = args[1];

        StringHandlerInvoker invoker = new StringHandlerInvoker();
        invoker.invoke(handlerName, input);
    }
}