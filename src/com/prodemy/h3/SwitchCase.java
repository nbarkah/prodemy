package com.prodemy.h3;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        String nilai = "A";

//        Scanner s = new Scanner(System.in);
//        System.out.println("Masukkan Nilai Mahasiswa : ");
//        String nilai = s.nextLine();

        switch (nilai){
            case "A":
                System.out.println("Nilai Anda " + nilai);
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda " + nilai);
                break;
            case "D":
                System.out.println("Nilai Anda " + nilai);
                break;
            default:
                System.out.println("Nilai Anda " + nilai);
        }
    }
}
