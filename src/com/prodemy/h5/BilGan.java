package com.prodemy.h5;

public class BilGan {
    public static void main(String[] args) {
        int n = 7;
        int temp = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                temp = i;
                count += temp;
            }
        }
        System.out.println(count);
    }
}
