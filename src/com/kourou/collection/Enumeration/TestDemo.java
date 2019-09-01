package com.kourou.collection.Enumeration;

import java.util.*;

/**
 * @Author： kourou
 * @Data： 2019/9/1 22:08
 * @Description：
 */
public class TestDemo {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        list.add("Hello");
        list.add("Hello");
        list.add("B");
        list.add("Bit");
        Enumeration<String> enumeration = list.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
