package com.xiaozhuaiyang.test;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","a");
        int h;
        String key = "aaaa";
        int hashCode = (h = key.hashCode()) ^ (h >>> 16);
        System.out.println(hashCode);
    }
}
