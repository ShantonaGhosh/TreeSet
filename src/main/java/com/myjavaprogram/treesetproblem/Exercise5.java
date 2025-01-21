package com.myjavaprogram.treesetproblem;

import java.util.TreeSet;

public class Exercise5 {

    public static void main() {
        TreeSet<String> t_set = new TreeSet<String>();
        t_set.add("Red");
        t_set.add("Green");
        t_set.add("Black");
        t_set.add("White");
        String s = t_set.getFirst();
        String a = t_set.getLast();
        System.out.print(s);
        System.out.print(a);

    }

}
