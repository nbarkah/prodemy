package com.prodemy.h3;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.printf("Masukkan Nilai Absen Anda : ");
//        int absen = sc.nextInt();
//
//        Scanner sc2 = new Scanner(System.in);
//        System.out.printf("Masukkan Nilai Nilai Anda : ");
//        int nilai = sc2.nextInt();
//
//        if (nilai >= 75 && absen >= 75){
//            System.out.println("Nilai Anda A");
//        } else if (nilai >= 65 && absen >= 65){
//            System.out.println("Nilai Anda B");
//        } else if (nilai >= 50 && absen >= 50){
//            System.out.println("Nilai Anda C");
//        } else if (nilai >= 40 && absen >= 40){
//            System.out.println("Nilai Anda D");
//        } else{
//            System.out.println("Nilai Anda E");
//        }


        //nyoba dengan kondisi nilai rata-rata
        int total = 0;

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Masukkan Nilai Nilai Anda : ");
        int nilai = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Masukkan Nilai Absen Anda : ");
        int absen = sc2.nextInt();

        if (total >= 75){
            total = (nilai + absen / 2);
            System.out.println("Nilai Anda A" + total);
        } else if (total >= 65){
            total = (nilai + absen / 2);
            System.out.println("Nilai Anda B" + total);
        } else if (total >= 50){
            total = (nilai + absen / 2);
            System.out.println("Nilai Anda C" + total);
        } else if (total >= 40){
            total = (nilai + absen / 2);
            System.out.println("Nilai Anda D" + total);
        } else{
            total = (nilai + absen / 2);
            System.out.println("Nilai Anda E" + total);
        }
    }
}