package com.prodemy.h7;

public class Persegi implements BidangDatar{
    private int panjangSisi;

    public Persegi(int panjangSisi) {
        this.panjangSisi = panjangSisi;
    }

    public double getLuas(){
        return (panjangSisi * panjangSisi);
    }

    @Override
    public String toString() {
        return "Persegi{" +
                "panjangSisi=" + panjangSisi +
                ", Luas= " + getLuas() +
                '}';
    }
}