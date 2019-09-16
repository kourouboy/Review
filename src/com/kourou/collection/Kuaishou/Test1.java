package com.kourou.collection.Kuaishou;

import java.util.Scanner;

/**
 * @Author： kourou
 * @Data： 2019/9/16 21:00
 * @Description：求最小长方形
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int x = in.nextInt();
            int y = in.nextInt();
            if (x == 0 || y == 0){
                return;
            }
            int xMAX ;
            int yMax ;
            int xMin ;
            int yMin ;
            xMAX = xMin = x;
            yMax = yMin = y;
            if (x > xMAX){
                xMAX = x;
            }else if (x < xMin){
                xMin = x;
                if (y > yMax){
                    yMax = y;
                }else if (y < yMin){
                    yMin = y;
                }
            }
            System.out.println(xMin + " " + yMin + "" + xMAX + " " + yMax);
        }
    }
}
