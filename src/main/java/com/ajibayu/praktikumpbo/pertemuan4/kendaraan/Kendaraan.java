package com.ajibayu.praktikumpbo.pertemuan4.kendaraan;

public class Kendaraan {
     String nama;
    int jmlRoda;

    public void nyalakanMesin(){
        System.out.println("Mesin" + nama + "telah dinyalakan!");
    }
    public void showInfo(){
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Jumlah roda: " + jmlRoda);
        
        extraInfo();
    }
    public void extraInfo(){
        
    }
}
 

