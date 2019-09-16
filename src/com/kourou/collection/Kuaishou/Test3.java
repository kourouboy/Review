package com.kourou.collection.Kuaishou;

import java.util.Scanner;

/**
 * @Author： kourou
 * @Data： 2019/9/16 21:24
 * @Description：求字符串的最长回文子串
 */
public class Test3 {
    public static String MaxLength(String s) {
        String sMax = null;
        int len = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String s1 = s.substring(i,j);
                if (isHuiWen(s)) {
                    len = s.length();
                }
                if (len > maxLen){
                    maxLen = len;
                    sMax = s1;
                }
                len = 0;
            }
        }
        return sMax;
    }
    public static boolean isHuiWen (String s){
        for (int i = 0; i < s.length() / 2; i++) {
            if (!(s.charAt(i) == s.charAt(s.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String max = MaxLength(s);
        System.out.println(max);
    }
}

