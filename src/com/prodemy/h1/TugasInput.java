package com.prodemy.h1;

import java.util.Scanner;

public class TugasInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap : ");
        String sayhi = sc.nextLine();
        System.out.printf("Hi perkenalkan saya " + sayhi + " dari Prodemy Gen 11\n");

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Masukkan Domisili : ");
        String sayhi2 = sc2.nextLine();
        System.out.printf("Sekarang berdomisili di " + sayhi2 + ". Terima Kasih");
    }
}