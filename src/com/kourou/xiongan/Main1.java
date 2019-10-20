package com.kourou.xiongan;

import java.util.Scanner;

/**
 * @Author： kourou
 * @Data： 2019/10/20 18:41
 * @Description：
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        System.out.println(judeg(num));
    }
    public static boolean judeg(String str){
        if (str.equals(""))
            return true;
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;

        while (start < end){
            while (!(str.charAt(start) >= 'a' && str.charAt(start) <= 'z' || str.charAt(start) >= '0'
            && str.charAt(start) <= '9'))
                start++;
            while (!(str.charAt(end) >= 'a' && str.charAt(end) <= 'z' || str.charAt(end) >= '0'
                    && str.charAt(end) <= '9'))
                end--;
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
