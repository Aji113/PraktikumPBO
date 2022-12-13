package com.ajibayu.praktikumpbo.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
              System.out.println("Masukan bilangan: ");
              int bilangan = input.nextInt();
              
                System.out.println("Masukan pembagi: ");
                int pembagi = input.nextInt();
                
                int hasil = bilangan / pembagi;
                System.out.println("Hasil pembagian (dibulatkan: " + hasil);
        }
        
        catch(ArithmeticException | InputMismatchException e){
            System.out.println("Tidak dapat memproses!");
        }
        
      
        }
    }
    

