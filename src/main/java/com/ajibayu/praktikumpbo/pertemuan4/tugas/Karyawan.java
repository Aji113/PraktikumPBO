package com.ajibayu.praktikumpbo.pertemuan4.tugas;

public class Karyawan {
    String nama;
    String NIP;
    String jnsKelamin;
    
    public void masukKerja(){
        System.out.println("Karyawan masuk kerja");
    }
    public void showInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + NIP);
        System.out.println("Jenis kelamin : " + jnsKelamin);
    }    
}
