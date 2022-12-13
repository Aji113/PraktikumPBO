package com.ajibayu.praktikumpbo.pertemuan4.kendaraan.challenge;

public class Main {
    public static void main(String[] args){
        // Pembuatan object
        Truk tronton = new Truk();
        Kendaraan kn = new Kendaraan();
        
        tronton.nama = "Tronton";
        tronton.jmlMuatan = 500;
        tronton.kecepatan = 80;
        
        kn.nama = "Truk derek";
        kn.jmlMuatan = 150;
        kn.kecepatan = 100;
        
        // Uji coba pemanggilan method
        tronton.showInfo();
        tronton.tujuan("Jakarta");
    }
}
 
