/* ***********************
 * CSC-20004 LECTURE 2   *
 * Java Collections      *
 * ***********************/
package uk.ac.keele.csc20004;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator1 implements Comparator<String> { 
    public int compare(String str1, String str2) { 
    String first_Str = str1 ; 
    String second_Str = str2; 

    return second_Str.compareTo(first_Str); 
    } 
}

class MyComparator2 implements Comparator<String> { 
    public int compare(String str1, String str2) { 
        if (str1.length() < str2.length())
            return -1;
        else if (str1.length() > str2.length())
            return 1;
        else 
            return 0;
    } 
}

public class TreeSetDemo { 
    public static void main(String[] args) 
    { 
        TreeSet<String> tree_set = new TreeSet<String>(new MyComparator1()); 
   
        tree_set.add("hello"); 
        tree_set.add("cya"); 
        tree_set.add("ciao"); 
        tree_set.add("farewell"); 
        tree_set.add("ciao"); 
        tree_set.add("bye"); 
        System.out.println("Set before using the comparator: "+ 
        tree_set); 
   
        System.out.println("The elements sorted in descending"+ 
        "order:"); 
        for (String element : tree_set) 
            System.out.print(element + " "); 
    } 
} 