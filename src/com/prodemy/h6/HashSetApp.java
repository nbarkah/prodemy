package com.prodemy.h6;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetApp {
    public static void main(String args[]) {

        HashSet<String> hset = new HashSet<String>();

        hset.add("A");
        hset.add("O");
        hset.add("R");
        hset.add("T");
        hset.add("S");
        //Duplikat
        hset.add("A");
        hset.add("R");
        //Kosong
        hset.add(null);
        hset.add(null);

        System.out.println(hset);

        // Menghapus semua
//        hset.clear();
//        System.out.println("Setelah dihapus semua : " + hset);

        // Iteration HashSet
        for (String temp : hset) {
            System.out.println(temp);
        }

        // Convert to Array
        String[] array = new String[hset.size()];
        hset.toArray(array);

        System.out.println("Array elements: ");
        for(String temp : array){
            System.out.println(temp);
        }

        // Convert to TreeSet
        Set<String> tset = new TreeSet<String>(hset);

        System.out.println("TreeSet contains: ");
        for(String temp : tset){
            System.out.println(temp);
        }
    }
}
