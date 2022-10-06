package com.prodemy.FT1;

public class BukuNurhaiBarkahKodeK {
    public static void main(String[] args) {
        // inputan di isi sesuai hackerrank Sample Input 0
        int n = 9; // inputan jumlah halaman
        int p = 6; // inputan halaman yang dituju
        int jumHalaman = 0;
        int noHalamanTujuan = 0;

        jumHalaman = n / 2; // jadi 3
        noHalamanTujuan = p / 2; // jadi 1

//        System.out.println("tes " + jumHalaman);
//        System.out.println("tes " + noHalamanTujuan);

        int temp = Math.min(noHalamanTujuan, (jumHalaman - noHalamanTujuan));

        System.out.println("Hasilnya: " + temp);
    }
}