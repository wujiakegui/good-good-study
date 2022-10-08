package com.xiao.common;


import com.google.common.collect.Lists;

import java.util.ArrayList;

/**
 * @Description
 * @Author huangxiao
 * @Date 2022-10-08
 */
public class ForCycleCollection {

    public static void main(String[] args) {
        String temp = "xiao";
        ArrayList<String> forList = Lists.newArrayList("xiao", "ku", "bu", "de", "mei", "shan");
        System.out.println(forList);
        for (int i = 0; i < forList.size(); i++) {
            if (temp.equals(forList.get(i))) {
                forList.remove(i);
            }
        }
        System.out.println(forList);
    }
}
