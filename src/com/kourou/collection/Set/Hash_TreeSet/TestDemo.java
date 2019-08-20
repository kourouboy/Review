package com.kourou.collection.Set.Hash_TreeSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author： kourou
 * @Data： 2019/8/19 13:21
 * @Description：
 */
public class TestDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("hello");
        set.add("Bit");
        set.add("hello");
        set.add("ztt");
        System.out.println(set);
        set.remove("hello");
        System.out.println(set);
        Set<String> set1 = new TreeSet<>();
        set1.add("a");
        set1.add("f");
        set1.add("e");
        set1.add("b");
        System.out.println(set1);
    }
}
