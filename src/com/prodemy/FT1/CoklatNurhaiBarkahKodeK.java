package com.prodemy.FT1;

public class CoklatNurhaiBarkahKodeK {
    public static void main(String[] args) {
        // inputan dari sample input (first test case)
        int n1 = 10; // jumlah uang
        int c1 = 2; // harga sebatang coklat
        int m1 = 5; // jumlah bungkus gratis yg diberikan

        // inputan dari sample input (second test case)
        int n2 = 12; // jumlah uang
        int c2 = 4; // harga sebatang coklat
        int m2 = 4; // jumlah bungkus gratis yg diberikan

        // inputan dari sample input (third test case)
        int n3 = 10; // jumlah uang
        int c3 = 9; // harga sebatang coklat
        int m3 = 0; // jumlah bungkus gratis yg diberikan

        //--------------------------------------------------------------------

        int total = 0;
        int bungkus = 0;

        total = n3 / c3; // 10/2 = 5 // 12/4 = 3 // 6/2 = 3
        bungkus = total; // 5 // 3 // 3

        if (bungkus < m3) {
            System.out.println(total);
        } else {
            while (bungkus >= m3) {
                total = total + 1;
                bungkus = bungkus - m3 + 1;
            }
        }

        System.out.println("hasil: " + total);
    }
}