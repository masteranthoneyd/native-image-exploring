package com.yangbingdong.acme.nativeimage.reflection;

import java.util.Map;

/**
 * @author bingdong.yang@salesforce-china.com
 */
public class StringHandlerRegistry {

    private static final Map<String, Class<? extends StringHandler>> map =
            Map.of("StringCapitalizer", StringCapitalizer.class,
                    "StringReverser", StringReverser.class);

    public static StringHandler getHandler(String name) {
        try {
            return map.get(name).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
