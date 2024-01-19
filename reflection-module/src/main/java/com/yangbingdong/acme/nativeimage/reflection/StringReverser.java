package com.yangbingdong.acme.nativeimage.reflection;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public class StringReverser implements StringHandler {

    @Override
    public String handle(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
