package com.ajibayu.praktikumpbo.pertemuan4.kendaraan;

public class Main {
     public static void main(String[] args){
               // Pembuatan object
        Mobil mb = new Mobil();
        
        // Mengisi nilai atribute
        mb.nama ="Bugati Chiron Super Sport 300+";
        mb.jmlRoda = 4;
        
        // Uji coba pemanggilan method
        mb.showInfo();
        mb.nyalakanMesin();
        mb.belok("Kanan");
    }
}

