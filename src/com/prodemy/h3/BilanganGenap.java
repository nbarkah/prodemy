package com.prodemy.h3;

import java.util.Scanner;

public class BilanganGenap {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan yang Anda inginkan : ");
        int in2 = in.nextInt();

        int i=1;
        int jumlah=0;
        while (jumlah<in2) {
            if (i%2==0){
                System.out.print(i);
                jumlah++;
                if (jumlah < in2) {
                    System.out.print(" ");
                }
            }
            i++;
        }
    }
}

//        Scanner in = new Scanner(System.in);
//        System.out.print("Masukkan yang Anda inginkan : ");
//        int in2 = in.nextInt();
//
//        int jumlah=2;
//        while (jumlah<in2) {
//            System.out.println(jumlah);
//            jumlah+=2;
//        }