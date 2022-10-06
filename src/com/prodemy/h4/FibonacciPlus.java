package com.prodemy.h4;

import com.prodemy.util.StringUtil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciPlus {
    static int[] bilangan;
    static int n = 0;
    static boolean check = false;

    public static void main(String[] args) {

        while (!check) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Masukkan angka yang anda inginkan : ");
                n = sc.nextInt();
                check = true;
            } catch (Exception exc) {
                System.out.println("Inputan salah, inputan harus bilangan");
            } finally {
                System.out.println("INI PRINT TERUS");
            }
        }

            bilangan = new int[n];

            bilangan[0] = 1;
            bilangan[1] = 1;
            bilangan[2] = 1;

            for (int i = 3; i < n; i++) {
                if (i < n - 4) {
                    bilangan[i] = bilangan[i - 1] + bilangan[i - 2] + bilangan[i - 3];
                } else {
                    bilangan[i] = bilangan[n - i - 1];
                }
            }

            // Print isi array
            for (int baris = 0; baris < n; baris++) {
                for (int kolom = 0; kolom < n; kolom++) {
                    if (baris == n / 2) {
                        System.out.print(StringUtil.pad(bilangan[kolom], 3) + " ");
                    } else if (kolom == n / 2) {
                        System.out.print(StringUtil.pad(bilangan[baris], 3) + " ");
                    } else {
                        System.out.print(StringUtil.pad("-", 3) + " ");
                    }
                }
                System.out.println();
            }
    }
}