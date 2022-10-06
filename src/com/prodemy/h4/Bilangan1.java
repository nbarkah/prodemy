package com.prodemy.h4;

import java.util.Scanner;

public class Bilangan1 {
    public static void main(String[] args) {
        int n = 9;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == j){
                    System.out.print(i);
                } else if (i+j == n-1){
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}