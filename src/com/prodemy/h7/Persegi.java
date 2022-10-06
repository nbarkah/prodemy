package com.prodemy.h7;

public class Persegi {
    int panjangSisi = 0;

    public Persegi(int panjangSisi) {
        this.panjangSisi = panjangSisi;
    }

    public double getLuas(){
        return (panjangSisi * 2);
    }

}
