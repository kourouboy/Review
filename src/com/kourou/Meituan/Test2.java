package com.kourou.Meituan;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author： kourou
 * @Data： 2019/10/16 16:13
 * @Description：
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }
    public static String Find(String s,String t){
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : t.toCharArray()){
            if (map.containsKey(c)){

            }else {
                map.put(c,1);
            }
        }
        return s;
    }
}
