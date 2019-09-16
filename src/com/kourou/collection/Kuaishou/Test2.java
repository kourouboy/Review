package com.kourou.collection.Kuaishou;

import java.util.Scanner;

/**
 * @Author： kourou
 * @Data： 2019/9/16 21:21
 * @Description：非递减数组
 */
public class Test2 {
    public int Demo(int[] arr){
        if (arr.length == 0){
            return 1;
        }
        if (arr.length == 1){
            return 1;
        }
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (res > 1){
                return 0;
            }
            if (arr[i] < arr[i -1]){
                res++;
                if (i - 1 > 0 && arr[i -2] > arr[i]){
                    arr[i] = arr[i -1];
                }else {
                    arr[i - 1] = arr[i];
                }
            }
        }
        return 1;
    }
}
