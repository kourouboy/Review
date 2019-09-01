package com.kourou.collection.Foreach;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author： kourou
 * @Data： 2019/9/1 22:11
 * @Description：
 */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello");
        list.add("B");
        list.add("Bit");
        for (String s : list){
            System.out.println(s);
        }
    }
}
