package com.kourou.collection.List.Vector;

import java.util.List;
import java.util.Vector;

/**
 * @Author： kourou
 * @Data： 2019/8/19 11:00
 * @Description：
 */
public class TestDemo {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("hello");
        list.add("hello");
        list.add("Bit");
        System.out.println(list);
        list.remove("hello");
        System.out.println(list);
    }
}
