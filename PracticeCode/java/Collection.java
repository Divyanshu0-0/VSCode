package java;

import java.util.*;
public class Collection {

    public static void main(String []args)
    {
        LinkedHashSet<String> h1 = new LinkedHashSet<String>();
        h1.add("C");
        h1.add("E");
        h1.add("A");
        h1.add("D");
        h1.add("B");
        h1.add("B");
        h1.add("G");
        System.out.println(h1);
    }
}