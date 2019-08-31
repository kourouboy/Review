package com.kourou.collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author： kourou
 * @Data： 2019/8/24 22:04
 * @Description：
 */
public class dEMO2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("B");
        list.add("bit");
        list.add("bit");
        Iterator<String> iterable = list.iterator();
        while (iterable.hasNext()){
            String str = iterable.next();
            if (str.equals("B")){
                iterable.remove();
                continue;
            }
            System.out.println(str);
        }
    }

}
