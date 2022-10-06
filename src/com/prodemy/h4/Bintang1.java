package com.prodemy.h4;

public class Bintang1 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
//                if (i == j){
//                    System.out.print("* ");
//                } else if (i+j == n-1){
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}