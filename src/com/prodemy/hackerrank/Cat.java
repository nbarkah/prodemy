package com.prodemy.hackerrank;

public class Cat {
    public static void main(String[] args) {
        int i,j,n = 0;
        n = 4;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(i+1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
