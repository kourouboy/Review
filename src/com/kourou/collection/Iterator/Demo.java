package com.kourou.collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author： kourou
 * @Data： 2019/8/19 14:58
 * @Description：
 */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("Bit");
        //实例化Iterator对象
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
