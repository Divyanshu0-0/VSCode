package java;

import java.util.*;
public class Collection1 {

    public static void main(String []args)
    {
        HashSet<String> h1 = new HashSet<String>();
        h1.add("A");
        h1.add("B");
        h1.add("C");
        h1.add("D");
        h1.add("E");
        h1.add("A");
        System.out.println(h1);
    }
}