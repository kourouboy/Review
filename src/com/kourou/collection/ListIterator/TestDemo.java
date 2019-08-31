package com.kourou.collection.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author： kourou
 * @Data： 2019/8/31 21:47
 * @Description：
 */
public class TestDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello");
        list.add("B");
        list.add("Bit");
        ListIterator<String> listIterator = list.listIterator();
        System.out.print("从前向后输出：");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next() + "、");
        }
        System.out.print("\n从后向前输出");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous()+"、");
        }
    }
}
