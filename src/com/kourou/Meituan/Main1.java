package com.kourou.Meituan;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author： kourou
 * @Data： 2019/10/16 15:43
 * @Description：
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String[] arr = str.split(",");
        System.out.println(Check(arr));
    }
    public static int Check(String[] arr){
        int count = 0;
        String[] a = Arrays.copyOf(arr,arr.length);
        Arrays.sort(a);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != a[i]){
                count++;
            }
        }
        return count;
    }
}
