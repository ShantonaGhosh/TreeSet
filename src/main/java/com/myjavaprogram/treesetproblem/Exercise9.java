package com.myjavaprogram.treesetproblem;

import java.util.Iterator;
import java.util.TreeSet;

public class Exercise9 {

    public static void main() {
        TreeSet<Integer> tree_num = new TreeSet<Integer>();
        TreeSet<Integer> treeHeadSet = new TreeSet<Integer>();

        tree_num.add(1);
        tree_num.add(2);
        tree_num.add(3);
        tree_num.add(5);
        tree_num.add(6);
        tree_num.add(7);
        tree_num.add(8);
        tree_num.add(9);
        tree_num.add(10);
        treeHeadSet = (TreeSet) tree_num.headSet(7);
        Iterator iterator = treeHeadSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

    }
}
