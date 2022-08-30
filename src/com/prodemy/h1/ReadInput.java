package com.prodemy.h1;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama : ");
        int pertama = sc.nextInt();
        System.out.printf("Angka pertama adalah %d\n", pertama);
        sc = new Scanner(System.in);
        System.out.print("Masukkan angkat kedua : ");
        int kedua = sc.nextInt();
        System.out.printf("Angka kedua adalah %d\n", kedua);
    }
}