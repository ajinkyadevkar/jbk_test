package com.jbk.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Question15 {

    public static void main(String[] args) {
  
        Map<String, Integer> s1 = new LinkedHashMap<>();
        s1.put("One", 1);
        s1.put("Two", 2);
        s1.put("Three", 3);
        s1.put("Four", 4);
        s1.put("Five", 5);  
        System.out.println("Original Map: " + s1);
       
        List<String> rev = new ArrayList<>(s1.keySet());
        Collections.reverse(rev);
        System.out.println("Reverse Order Keys: " + rev);
    }
}

