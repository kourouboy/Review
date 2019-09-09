package com.kourou.collection.qianxin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author： kourou
 * @Data： 2019/9/9 19:18
 * @Description：
 */
public class Text1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = 0;
        while (in.hasNext()){
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= N; i++) {
                list.add(N);
            }
            for (int i = 1; i <= 5; i++) {
                if (i == 5){
                    list.remove(4);
                    count++;
                    continue;
                }
            }
            if (list.size() == 0) {
                return;
            }
        }
    }
}
