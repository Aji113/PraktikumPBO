package com.ajibayu.praktikumpbo.pertemuan4.kendaraan.challenge;


public class Kendaraan {
    String nama;
    int jmlMuatan;
    int kecepatan;
    
    public void showInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Junlah muatan truk : " +jmlMuatan);
        System.out.println("Kecepatan : " + kecepatan);
        extraInfo();
    }
    public void extraInfo(){
        
    }
}
