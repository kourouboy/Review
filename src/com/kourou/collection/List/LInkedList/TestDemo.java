package com.kourou.collection.List.LInkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author： kourou
 * @Data： 2019/8/19 11:13
 * @Description：
 */
public class TestDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("hello");
        list.add("hello");
        list.add("Bit");
        System.out.println(list);
        list.remove("hello");
        System.out.println(list);
    }
}
