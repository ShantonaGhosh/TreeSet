
package com.myjavaprogram.treesetproblem;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Exercise4 {
       public static void main(){
          TreeSet<String> t_set = new TreeSet<String>();
        t_set.add("Red");
        t_set.add("Green");
        t_set.add("Black");
        t_set.add("White");
        Iterator it= t_set.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
           
    }
    
}
