/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.utsmaven;

import java.util.Scanner;

/**
 *
 * @author A-19
 */
public class NewClass {
    public static void main(String[] args) {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("UTS 20 MEI 2024 BY PRIMAJAYA EKASAPUTRA NIM 23201267");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Masukkan huruf: ");
        
        String nama;
        int jk;
        int angka1, angka2;
        char operator;
        char pilihan;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Silahkan Input Nama Anda: ");
        nama = scanner.nextLine();
        
        System.out.println("Jenis Kelamin : \n 1. Laki - Laki \n 2. Perempuan \n Entri Pilihan Anda (1 or 2) : ");jk = scanner.nextInt();
        switch (jk) {
            case 1:
            System.out.println("Selamat Datang Mas " + nama);
            break;
            case 2:
            System.out.println("Selamat Datang Mba " + nama);
            break;
            default:
            System.out.println("Pilihan tidak valid");
        }
        System.out.println("Kalkulator");
        
        do {
            System.out.println("Masukkan angka pertama: ");
            angka1 = scanner.nextInt();
            System.out.println("Masukkan operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);
            System.out.println("Masukkan angka kedua: ");
            angka2 = scanner.nextInt();
            // Menghitung hasil
            int hasil;
            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':
                    if (angka2 == 0) {
                        System.out.println("Pembagian dengan 0 tidak diizinkan!");
                    return;
                    }
                    hasil = angka1 / angka2;
                    break;
                default:
                System.out.println("Operator tidak valid!");
                return;
            }
            // Menampilkan hasil
            System.out.println("Hasil: " + hasil);
            System.out.println("Apakah Anda ingin melanjutkan (y/n)?");
            pilihan = scanner.next().charAt(0);
            
        } while (pilihan == 'y' || pilihan == 'Y');
            System.out.println("Terima kasih sudah menggunakan kalkulator");
            scanner.close();
        
    }
}
