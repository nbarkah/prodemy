package com.prodemy.h6;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");

        for (String value : collection) {
            System.out.println(value);
        }
    }
}