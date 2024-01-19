package com.yangbingdong.acme.nativeimage.reflection;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public class StringCapitalizer implements StringHandler {

    @Override
    public String handle(String input) {
        return input.toUpperCase();
    }
}
