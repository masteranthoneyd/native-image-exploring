package com.yangbingdong.acme.nativeimage.reflection;

import static java.lang.StringTemplate.STR;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public class StringHandlerInvoker {

    public void invoke(String handlerName, String input) {
        String result = StringHandlerRegistry.getHandler(handlerName).handle(input);
        System.out.println(STR."handle result: \{input} -> \{result}");
    }
}
