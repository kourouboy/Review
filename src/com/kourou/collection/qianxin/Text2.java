package com.kourou.collection.qianxin;

/**
 * @Author： kourou
 * @Data： 2019/9/9 19:43
 * @Description：
 */
import java.util.*;

public class Text2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int max_length_substring(String s) {

        if (s.length() == 0 || s != null){
            return 0;
        }
        int max = 1;
        List<Character> list = new ArrayList<>();
        list.add(s.charAt(0));
        for (int i = 0; i <s.length() ; i++) {
            if (list.contains(s.charAt(i))){
                int index = list.indexOf(s.charAt(i));
                list = list.subList(index + 1,list.size());
                list.add(s.charAt(i));
                max = Math.max(max,list.size());
            }
        }
        return max;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        String _s;
        try {
            _s = in.nextLine();
        } catch (Exception e) {
            _s = null;
        }

        res = max_length_substring(_s);
        System.out.println(String.valueOf(res));

    }
}

