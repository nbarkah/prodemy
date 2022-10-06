package com.prodemy.h3;

public class UrutArray {
    public static void main(String[] args) {
        int angkaArr[] = new int[]{51,6,3,7,89};
        int i, j, temp;

        for (i=0; i < angkaArr.length; i++) {
            for (j=i+1; j< angkaArr.length; j++) {
                if (angkaArr[i] > angkaArr[j]) {
                    temp = angkaArr[i];
                    angkaArr[i] = angkaArr[j];
                    angkaArr[j] = temp;
                }
            }
        }


        System.out.println("Dari kecil ke besar");
        for (i=0; i<5; i++) {
            System.out.println(angkaArr[i] + " ");
        }

        System.out.println("--------------------------");

        System.out.println("Dari besar ke kecil");
        for (i=0;i<=4;i++) {
            System.out.println(angkaArr[4-i] + " ");
        }
    }
}