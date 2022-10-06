package com.prodemy.h6;

import java.util.ArrayList;
import java.util.Collections;

public class ListApp {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("c");
        alist.add("f");
        alist.add("o");
        alist.add("p");
        alist.add("a");
        alist.add("m");
        alist.add("v");
        alist.add("v");

        System.out.println(alist);

        System.out.println("Nambah list sesuai index");
        alist.add(3,"z");

        System.out.println(alist);

        // Mengubah isi dalam index array
        System.out.println("Setelah di ubah");
        alist.set(3,"x");
        System.out.println(alist);

        // Menghapus isi dalam index array
        System.out.println("Setelah di hapus");
        alist.remove(3);
        System.out.println(alist);

        // Iterating ArrayList
        System.out.println("Iterating ArrayList");
        for (String list : alist) {
            System.out.print(list + " ");
        }
        System.out.println();

        // Ascending / Mengurutkan dari depan ArrayList
        System.out.println("Setelah diurutkan");
        Collections.sort(alist);
        for (String list : alist) {
            System.out.print(list + " ");
        }
        System.out.println();

        // Descending / Mengurutkan dari belakang ArrayList
        System.out.println("Setelah diurutkan dari belakang");
//        Collections.sort(alist, Collections.reverseOrder());
        Collections.reverse(alist);
        for (String list2 : alist) {
            System.out.print(list2 + " ");
        }
        System.out.println();

        // Menampilkan ukuran element Array
        System.out.println("Banyaknya element di Array alist : " + alist.size());
    }
}