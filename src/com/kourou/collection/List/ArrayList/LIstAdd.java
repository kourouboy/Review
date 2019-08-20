package com.kourou.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Author： kourou
 * @Data： 2019/8/17 20:44
 * @Description：List允许保存重复数据
 */
public class LIstAdd {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        System.out.println(list.size() + "、" + list.isEmpty());
        list.add("hello");
        list.add("world");
        list.add("hello");
        System.out.println(list.size() + "、" + list.isEmpty());
        System.out.println(list);
        System.out.println(list.remove("hello"));
        System.out.println(list.contains("as"));
        System.out.println(list.contains("Bit"));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Collection<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("hello");
        list1.add("Bit");
        //操作以Object为主，有可能需要向下转型，就可能产生ClassCastException
        Object[] res = list1.toArray();
        System.out.println(Arrays.toString(res));
    }
}
