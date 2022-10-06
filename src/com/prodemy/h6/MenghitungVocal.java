package com.prodemy.h6;

import java.util.LinkedList;
import java.util.Scanner;

public class MenghitungVocal {
    static char[] vokals = new char[] {'a','i','u','e','o'};
    static LinkedList<HurufVokal> hurufCollection = new LinkedList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        String kalimat = sc.nextLine();

        for (int i = 0; i < kalimat.length(); i++) {
            addHuruf(kalimat.toLowerCase().charAt(i));
        }

        // Menampilkan hasil
        for (HurufVokal hv : hurufCollection) {
            System.out.print(hv);
        }
    }

    public static void addHuruf(char huruf) {
        boolean ditemukan = false;
        for (HurufVokal hv : hurufCollection) {
            if (hv.vokal == huruf) {
                hv.jumlah++;
                ditemukan = true;
            }
        }

        if (!ditemukan && apakahHurufVokal(huruf)) {
            HurufVokal hv = new HurufVokal();
            hv.vokal = huruf;
            hv.jumlah = 1;
            hurufCollection.add(hv);
        }
    }

    static boolean apakahHurufVokal(char huruf) {
        for (char c : vokals) {
            if (huruf == c) return true;
        }
        return false;
    }

    static class HurufVokal {
        char vokal;
        int jumlah = 0;
        String cv = " ";

        public String toString() {
            for (int i = 0; i < jumlah; i++) {
                cv += vokal;
            }
        return cv + " ";
        }
    }
}