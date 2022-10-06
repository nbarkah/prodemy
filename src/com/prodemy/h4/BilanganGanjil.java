package com.prodemy.h4;

import java.util.Scanner;

public class BilanganGanjil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka yang anda inginkan : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == j){
                    System.out.print((i*2)+1);
                } else if (i+j == n-1){
                    System.out.print((j*2)+1);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}