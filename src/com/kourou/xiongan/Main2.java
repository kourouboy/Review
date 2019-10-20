package com.kourou.xiongan;

import java.util.Scanner;

/**
 * @Author： kourou
 * @Data： 2019/10/20 18:56
 * @Description：
 */
public class Main2 {
    public static int sum = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        pufangkuai(a);
        System.out.println(sum);
    }
    private static void pufangkuai(int N){
        if (N == 0){
            sum++;
            return;
        }
        if (N < 0){
            return;
        }
        pufangkuai(N - 1);
        pufangkuai(N - 2);
    }
}
