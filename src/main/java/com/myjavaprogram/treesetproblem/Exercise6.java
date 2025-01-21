
package com.myjavaprogram.treesetproblem;

import java.util.TreeSet;


public class Exercise6 {
      public static void main() {
        TreeSet<String> t_set = new TreeSet<String>();
        t_set.add("Red");
        t_set.add("Green");
        t_set.add("Black");
        t_set.add("White");
          TreeSet<String> t_set1 =(TreeSet<String>)t_set.clone();
           System.out.print(t_set1);
       

    }
    
}
