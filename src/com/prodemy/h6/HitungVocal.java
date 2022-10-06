package com.prodemy.h6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public class HitungVocal {
    static char[] vocals = new char[] {'a','e','i','o','u'};
    static String kalimat = "Saya sedang belajar Java";
    static Collection<HurufVocal> hurufCollection = new ArrayList();

    public static void main(String[] args) {
        for (int i=0; i<kalimat.length(); i++) {
            tambah(kalimat.toLowerCase().charAt(i));
        }

        // Menampilkan hasil
        for (HurufVocal hv : hurufCollection) {
            System.out.println(hv);
        }
    }

    public static void tambah(char huruf) {
        boolean ditemukan = false;
        for (HurufVocal hv : hurufCollection) {
            if (hv.vocal == huruf) {
                hv.jumlah++;
                ditemukan = true;
            }
        }

        if (!ditemukan && apakahHurufVocal(huruf)) {
            HurufVocal hv = new HurufVocal();
            hv.vocal = huruf;
            hv.jumlah = 1;
            hurufCollection.add(hv);
        }
    }

    static boolean apakahHurufVocal(char huruf) {
        for (char c : vocals) {
            if (huruf==c) return true;
        }
        return false;
    }

    static class HurufVocal {
        char vocal;
        int jumlah = 0;

        @Override
        public String toString() {
            return "HurufVocal{" +
                    "vocal=" + vocal +
                    ", jumlah=" + jumlah +
                    '}';
        }
    }
}
