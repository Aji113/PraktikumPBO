
package com.ajibayu.praktikumpbo.pertemuan6;

public class Basic {
    public static void main(String[] args) {
        // membuat Arrray isi 3
        int[] myNumbers = { 1, 2, 3 };
        
        // Uji coba print nilay array index ke-10
        try {
        System.out.println("myNumbers [10]");
    }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array gk sebesar itu!");
        }
     }
}
