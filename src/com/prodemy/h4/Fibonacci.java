package com.prodemy.h4;

import com.prodemy.util.StringUtil;

public class Fibonacci {
    static int[] bilangan;

    public static void main(String[] args) {
        int n = 9;
        bilangan = new int[n];

        bilangan[0] = 1;
        bilangan[1] = 1;
        bilangan[2] = 1;

        for (int i = 3; i < n; i++){
            bilangan[i] = bilangan[i-1] + bilangan[i-2] + bilangan[i-3];
        }

        // Print isi array
        for (int baris = 0; baris < n; baris++){
            for (int kolom = 0; kolom < n; kolom++){
                if (baris==kolom || baris+kolom == n-1){
                    System.out.print(StringUtil.pad(bilangan[kolom], 3)+ " ");
                } else {
                    System.out.print(StringUtil.pad("-", 3)+" ");
                }
            }
            System.out.println();
        }
    }
}